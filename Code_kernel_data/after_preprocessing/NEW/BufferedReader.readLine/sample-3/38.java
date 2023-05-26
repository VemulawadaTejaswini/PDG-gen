//38
public class func{
public void readResponse(InputStream is){
        while ((line = reader.readLine()) != null) {
            out.append(line);
            out.append("\r\n");
        }
        return out.toString();
}
}
