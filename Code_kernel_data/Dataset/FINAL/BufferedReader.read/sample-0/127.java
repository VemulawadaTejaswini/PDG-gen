public class func{
public void getResourceAsString(String resourceName){
            InputStream in = Resource.class.getResourceAsStream(resourceName);
            if (in == null) {
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(in, ENCODING_UTF8));
            while (-1 != (n = reader.read(buffer))) {
                writer.write(buffer, 0, n);
            }
            writer.flush();
            return writer.toString();
}
}
