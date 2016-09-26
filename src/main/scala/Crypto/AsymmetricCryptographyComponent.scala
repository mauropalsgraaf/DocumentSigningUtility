package Crypto

import java.security.{KeyPair, PrivateKey, PublicKey}

trait AsymmetricCryptographyComponent {
  def encrypt(text: Array[Byte], key: PublicKey): Array[Byte]
  def decrypt(text: Array[Byte], key: PrivateKey): Array[Byte]
  def generateKeyPair(): KeyPair

  trait Encryptor {
    def encrypt: Array[Byte]
  }
}
