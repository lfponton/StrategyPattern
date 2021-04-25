import context.Compressor;
import strategy.SevenCCompression;

import java.util.ArrayList;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {
    Compressor compressor = new Compressor();
    List<String> files = new ArrayList<>();
    files.add("classified");
    files.add("top-secret");
    compressor.setMethod(new SevenCCompression());
    compressor.compress(files);
  }
}
