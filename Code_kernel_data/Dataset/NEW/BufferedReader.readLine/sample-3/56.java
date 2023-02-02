//56
public class func{
public void getContent(InputStream is){
    BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
    while ((line = buffer.readLine()) != null) {
      builder.append(line).append("\n");
    }
    buffer.close();
}
}
