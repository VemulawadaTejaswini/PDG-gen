public class func{
public void getReaderAsString(Reader r){
      reader = new BufferedReader(r);
      while ((charsRead = reader.read(buf)) != -1) {
        text.append(buf, 0, charsRead);
      }
      return text.toString();
}
}
