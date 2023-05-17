public class func{
public void setupScriptConfig(){
                    BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"), 1024);
                    while ((read=reader.read(buf)) != -1)
                    {
                        fileContents.append(buf, 0, read);
                    }
                    this.xmlConfig = fileContents.toString();
}
}
