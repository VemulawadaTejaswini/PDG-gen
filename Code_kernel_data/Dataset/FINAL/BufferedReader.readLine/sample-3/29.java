public class func{
public void fromStream(InputStream in){
      while ((line = reader.readLine()) != null) {
          out.append(line);
      }
      return out.toString();
}
}
