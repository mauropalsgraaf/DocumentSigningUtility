package Crypto

trait Hasher {
  def hash(toHash: String): String
}
