public class func{
public void readResponse(HttpURLConnection conn){
        while((line=in.readLine())!=null) {
                buff.append(line);
        }
        in.close();
}
}
