public class func{
public void readTemplate(InputStream template){
        while ((line = reader.readLine())  != null) {
            buf.append(line + System.getProperty("line.separator"));
        }
}
}
