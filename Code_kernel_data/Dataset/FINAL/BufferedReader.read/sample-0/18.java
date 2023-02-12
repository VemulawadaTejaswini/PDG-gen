public class func{
public void readResource(String resource){
            InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
            }
            reader.close();
}
}
