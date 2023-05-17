public class func{
public void handlePutMetadata(BufferedReader reader,String boundary,IFileStore file){
    while ((line = reader.readLine()) != null && !line.equals(boundary))
      buf.append(line);
}
}
