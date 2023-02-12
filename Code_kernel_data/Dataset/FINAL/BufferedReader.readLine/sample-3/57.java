public class func{
public void readFullyToString(InputStream inputStream){
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        while ((line = reader.readLine()) != null) {
            buf.append(line);
            buf.append(PMD.EOL);
        }
        reader.close();
}
}
