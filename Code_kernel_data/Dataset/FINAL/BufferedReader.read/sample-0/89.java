public class func{
public void readString(InputStream inputStream,String encoding){
      reader = new BufferedReader(new InputStreamReader(inputStream, encoding));
      while ((read = reader.read(part)) != -1)
        buffer.append(part, 0, read);
      return buffer.toString();
}
}
