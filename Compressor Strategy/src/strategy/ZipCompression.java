package strategy;

public class ZipCompression implements CompressionMethod
{
  @Override public String compress(String fileName)
  {
    return "Compressing the file to " + fileName + ".zip";
  }
}
