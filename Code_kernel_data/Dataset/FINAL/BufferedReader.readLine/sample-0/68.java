public class func{
public void getEntityAsString(InputStream entityStream){
        BufferedReader reader = new BufferedReader(new InputStreamReader(entityStream));
        while ((line = reader.readLine()) != null) {
            writer.write(line);
        }
        return writer.toString();
}
}
