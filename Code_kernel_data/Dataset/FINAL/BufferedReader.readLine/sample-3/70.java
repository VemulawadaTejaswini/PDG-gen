public class func{
public void convertStreamToString(final InputStream is){
        while ((line = reader.readLine()) != null) {
            sb.append(line + "\n");
        }
        is.close();
}
}
