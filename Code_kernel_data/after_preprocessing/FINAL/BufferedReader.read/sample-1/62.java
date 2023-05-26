public class func{
public void readContent(InputStream input){
      while ((charsRead = reader.read(charBuff)) > -1) {
        strBuff.append(charBuff, 0, charsRead);
      }
      reader.close();
}
}
