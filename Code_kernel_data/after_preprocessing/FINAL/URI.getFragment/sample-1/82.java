public class func{
public void run(){
            Socket sock = ss.accept();
            InputStream is = sock.getInputStream();
            OutputStream os = sock.getOutputStream();
            MessageHeader headers =  new MessageHeader (is);
            String requestLine = headers.getValue(0);
            int first  = requestLine.indexOf(' ');
            int second  = requestLine.lastIndexOf(' ');
            String URIString = requestLine.substring(first+1, second);
            URI requestURI = new URI(URIString);
            if (requestURI.getFragment() != null)
                os.write(replyFAILED.getBytes("UTF-8"));
            else
                os.write(replyOK.getBytes("UTF-8"));
}
}
