package File

final class SimpleFileReader extends FileReader {
  override def read(filePath: String): String = {
    val lines = scala.io.Source.fromFile(filePath).mkString
    lines
  }

  override def write(filePath: String, toWrite: String): Unit = {
    // do nothing so far
  }
}
