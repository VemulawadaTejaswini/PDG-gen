public class func{
public void readInputStream(InputStream inputStream){
        while ((responseLine = bufferedReader.readLine()) != null) {
            responseBuilder.append(responseLine);
        }
        return responseBuilder.toString();
}
}
