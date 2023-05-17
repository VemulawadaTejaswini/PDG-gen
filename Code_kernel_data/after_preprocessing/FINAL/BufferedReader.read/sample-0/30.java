public class func{
public void readStreamAsString(InputStream in){
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    while ((numRead = reader.read(buf)) != -1)
      fileData.append(buf, 0, numRead);
    reader.close();
}
}
