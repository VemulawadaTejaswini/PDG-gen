public class func{
public void readUTF8Textfile(InputStream pInputStream){
    Reader r = new InputStreamReader(pInputStream, "utf-8");
    BufferedReader in = new BufferedReader(r);
    while ((line = in.readLine()) != null)
      content.append(line).append(lineFeed);
    in.close();
}
}
