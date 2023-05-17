public class func{
public void readResponse(BufferedReader reader){
                char c = (char)reader.read();
                body.append(c);
        return new Response(code, headers, body.toString().trim());
}
}
