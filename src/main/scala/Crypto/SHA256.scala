package Crypto

import java.security.MessageDigest

trait SHA256 extends Hasher {
  val messageDigest: MessageDigest

  override def hash(toHash: String): String = {
    val hashed: Array[Byte] = messageDigest.digest(toHash.getBytes("UTF-8"))

    new String(hashed)
  }
}
