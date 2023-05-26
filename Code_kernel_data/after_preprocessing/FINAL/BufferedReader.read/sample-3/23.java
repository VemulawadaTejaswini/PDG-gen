public class func{
public void getContentFile(File file){
          while ((num = reader.read(buffer)) > 0) {
            content.append(buffer, 0, num);
          }
          result = content.toString();
}
}
