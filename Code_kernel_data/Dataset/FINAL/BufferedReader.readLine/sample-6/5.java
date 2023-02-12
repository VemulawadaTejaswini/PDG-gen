public class func{
public void parseExecResult(BufferedReader lines){
    String line = lines.readLine();
    if (line == null) {
      throw new IOException("Expecting a line not the end of stream");
    }
    String[] tokens = line.split("\t");
}
}
