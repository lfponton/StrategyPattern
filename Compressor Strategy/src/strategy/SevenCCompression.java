package strategy;

public class SevenCCompression implements CompressionMethod
{
  @Override public String compress(String fileName)
  {
    return "Compressing the file to " + fileName + ".7c";
  }
}
