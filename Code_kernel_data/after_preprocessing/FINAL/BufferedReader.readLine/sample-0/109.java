public class func{
public void FileDescription(InputStream data,String mimeType,long lastModified){
                BufferedReader reader = new BufferedReader(new InputStreamReader(data));
                this.content = reader.readLine();
                reader.close();
}
}
