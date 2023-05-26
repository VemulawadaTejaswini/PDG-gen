//9
public class func{
public void readOldContent(File target,String charset){
        reader = new BufferedReader(new FileReader(target));
        final InputStream fileInputStream = new FileInputStream(target);
        final InputStreamReader fileReader = new InputStreamReader(fileInputStream, charset);
        reader = new BufferedReader(fileReader);
      int length = reader.read(buf);
      while (length > 0) {
        oldContent.append(buf, 0, length);
        length = reader.read(buf);
      }
      if (reader != null) {
        reader.close();
      }
}
}
