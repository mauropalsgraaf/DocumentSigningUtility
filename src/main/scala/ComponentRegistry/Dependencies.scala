package ComponentRegistry

import java.security.MessageDigest
import javax.crypto.Cipher

import Crypto.{AsymmetricCryptography, Hasher, RSAAsymmetricCryptography, SHA256}
import File.{FileReader, SimpleFileReader}

trait Dependencies {
  private val rsaAsymmetricCryptographyComponent = new RSAAsymmetricCryptography {
    override val cipher: Cipher = Cipher.getInstance("RSA")
  }

  private val sha256Hasher = new SHA256 {
    override val messageDigest: MessageDigest = MessageDigest.getInstance("SHA-256")
  }

  private val simpleFileReader = new SimpleFileReader

  def asymmetricCryptographyComponent: AsymmetricCryptography = rsaAsymmetricCryptographyComponent
  def hasher: Hasher = sha256Hasher
  def fileReader: FileReader = simpleFileReader
}
