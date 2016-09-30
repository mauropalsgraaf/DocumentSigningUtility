package File

trait FileReader {
  def read(filePath: String): String
  def write(filePath: String, toWrite: String): Unit
}
