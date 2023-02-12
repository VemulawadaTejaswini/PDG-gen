public class func{
public void convertStreamToString(InputStream in){
        while ((line = reader.readLine()) != null) {
          stringbuilder.append(line + "\n");
        }
        in.close();
}
}
