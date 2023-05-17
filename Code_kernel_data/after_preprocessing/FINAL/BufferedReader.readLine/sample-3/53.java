public class func{
public void convertInputStreamToString(InputStream inputStream){
        while ((line = bufferedReader.readLine()) != null)
            result.append(line + "\n");
        inputStream.close();
}
}
