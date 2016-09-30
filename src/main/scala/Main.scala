import ComponentRegistry.ComponentRegistry
import Crypto.SHA256

object Main {
  def main(args: Array[String]): Unit = {
    val hasher = ComponentRegistry.hasher
    val fileReader = ComponentRegistry.fileReader

    println(fileReader.read("/users/mauropalsgraaf/.ssh/id_rsa.pub"))
  }
}