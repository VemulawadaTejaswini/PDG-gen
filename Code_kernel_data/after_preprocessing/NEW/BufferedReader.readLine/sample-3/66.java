//66
public class func{
public void readErrorMessageFromResponse(HttpURLConnection conn){
        while((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        bufferedReader.close();
}
}
