public class func{
public void xmlPullParserFromSocket(InputStream socketInputStream){
        BufferedReader br = new BufferedReader(new InputStreamReader(socketInputStream));
        while ((line = br.readLine()) != null && line.length() > 0); // eat the HTTP POST headers
}
}
