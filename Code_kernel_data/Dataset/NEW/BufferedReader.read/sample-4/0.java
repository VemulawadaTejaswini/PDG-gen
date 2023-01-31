//0
public class func{
public void getContents(File file){
      int nextChar = reader.read();
      while (nextChar >= 0) {
        builder.append((char) nextChar);
        nextChar = reader.read();
      }
}
}
