public class func{
public void readContent(InputStream input){
        reader = new BufferedReader(isr);
        while ((charsRead = reader.read(charBuff)) > -1) {
          strBuff.append(charBuff, 0, charsRead);
        }
        CodeGenUtil.closeQuietly(reader);
}
}
