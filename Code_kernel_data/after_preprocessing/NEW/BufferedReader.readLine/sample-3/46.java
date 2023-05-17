//46
public class func{
public void toString(InputStream inputStream){
        if (inputStream != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (null != (string = reader.readLine())) {
                outputBuilder.append(string).append('\n');
            }
        }
}
}
