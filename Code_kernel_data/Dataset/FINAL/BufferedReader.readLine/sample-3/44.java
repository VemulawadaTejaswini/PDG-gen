public class func{
public void convertStreamToString(InputStream is){
    while ((line = reader.readLine()) != null) {
      sb.append(line).append("\n");
    }
    reader.close();
}
}
