package Crypto

import java.security.MessageDigest

object SHA256 extends Hasher {
  override def hash(toHash: String): String = {
    val sha256: MessageDigest = MessageDigest.getInstance("SHA-256")

    val hashed: Array[Byte] = sha256.digest(toHash.getBytes("UTF-8"))

    new String(hashed)
  }
}
