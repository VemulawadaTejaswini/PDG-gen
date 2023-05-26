public class func{
public void readContent(IFile file){
      reader = new BufferedReader(new InputStreamReader(is, encoding));
      while ((read = reader.read(part)) != -1) {
        buffer.append(part, 0, read);
      }
      return buffer.toString();
}
}
