package Crypto
import java.security._
import javax.crypto.Cipher

object RSA extends AsymmetricCryptographyComponent {
  val ALGORITHM = "RSA"

  override def encrypt(text: Array[Byte], key: PublicKey): Array[Byte] = {
    val cipher = Cipher.getInstance(ALGORITHM)

    cipher.init(Cipher.ENCRYPT_MODE, key)

    cipher.doFinal(text)
  }

  override def decrypt(text: Array[Byte], key: PrivateKey): Array[Byte] = {
    val cipher = Cipher.getInstance(ALGORITHM)

    cipher.init(Cipher.DECRYPT_MODE, key)

    cipher.doFinal(text)
  }

  override def generateKeyPair(): KeyPair = {
    val keyGen = KeyPairGenerator.getInstance(ALGORITHM)
    val secureRandom = SecureRandom.getInstance("SHA1PRNG", "SUN")

    keyGen.initialize(2048, secureRandom)
    val keyPair = keyGen.generateKeyPair()

    keyPair
  }
}
