public class func{
public void readStream(final InputStream is){
      final BufferedReader reader = new BufferedReader(
          new InputStreamReader(is));
      while ((numRead = reader.read(chars)) > -1) {
        sb.append(new String(chars, 0, numRead));
      }
      reader.close();
}
}
