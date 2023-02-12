public class func{
public void readFileAsString(final String filePath){
      final BufferedReader reader = new BufferedReader(new FileReader(filePath));
      while((length = reader.read(buf)) > -1){
    fileData.append(String.valueOf(buf, 0, length).replaceAll("_ExternalUrl_", ExternalUrl));
      }
      reader.close();
}
}
