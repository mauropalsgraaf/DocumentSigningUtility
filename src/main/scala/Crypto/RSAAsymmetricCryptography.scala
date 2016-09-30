package Crypto

import java.security._
import javax.crypto.Cipher

trait RSAAsymmetricCryptography extends AsymmetricCryptography {
  val cipher: Cipher

  override def encrypt(text: Array[Byte], key: Key): Array[Byte] = {
    cipher.init(Cipher.ENCRYPT_MODE, key)

    cipher.doFinal(text)
  }

  override def decrypt(text: Array[Byte], key: Key): Array[Byte] = {
    cipher.init(Cipher.ENCRYPT_MODE, key)

    cipher.doFinal(text)
  }

  override def generateKeyPair(): KeyPair = {
    val keyGen = KeyPairGenerator.getInstance("RSA")
    val secureRandom = SecureRandom.getInstance("SHA1PRNG", "SUN")

    keyGen.initialize(2048, secureRandom)
    val keyPair = keyGen.generateKeyPair()

    keyPair
  }
}
