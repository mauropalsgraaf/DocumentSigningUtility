package Crypto

import java.security.{Key, KeyPair}

trait AsymmetricCryptography {
  def encrypt(text: Array[Byte], key: Key): Array[Byte]
  def decrypt(text: Array[Byte], key: Key): Array[Byte]
  def generateKeyPair(): KeyPair
}
