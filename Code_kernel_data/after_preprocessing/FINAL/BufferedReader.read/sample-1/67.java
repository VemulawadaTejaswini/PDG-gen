public class func{
public void getEntireResponse(final BufferedReader in){
            while ((chars = in.read(cbuf, 0, 1024)) != -1) {
                response.append(cbuf, 0, chars);
            }
}
}
