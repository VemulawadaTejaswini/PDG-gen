public class func{
public void readMultilineResponse(HttpURLConnection conn){
        while((line = reader.readLine())!=null){
            sb.append(line).append("\n");
        }
}
}
