import java.security.KeyPair

import Crypto.{RSA, SHA256}

object Main {
  def main(args: Array[String]): Unit = {
    val keyPair: KeyPair = RSA.generateKeyPair()
    val encryptedBytes: Array[Byte] = RSA.encrypt("test".getBytes, keyPair.getPublic)

    println(SHA256.hash("test"))
    println(SHA256.hash("test"))

  }
}