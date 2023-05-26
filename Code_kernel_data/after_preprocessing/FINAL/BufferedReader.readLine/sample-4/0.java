public class func{
public void parseHeader(String responseString){
        BufferedReader br = new BufferedReader(new StringReader(responseString));
        assertEquals("HTTP/1.1 200 OK",br.readLine());
        br.readLine();
}
}
