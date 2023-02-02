//95
public class func{
public void parseExecResult(BufferedReader lines){
      while ( (nRead = lines.read(buf, 0, buf.length)) > 0 ) {
        output.append(buf, 0, nRead);
      }
}
}
