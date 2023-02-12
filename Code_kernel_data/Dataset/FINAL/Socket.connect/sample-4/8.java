public class func{
public void test(String hn,int timeout,boolean shouldTimeout){
        if (timeout == 0)
            so.connect(isa);
        else {
            try {
                so.connect(isa, timeout);
            } catch (SocketTimeoutException x) {
                if (shouldTimeout) {
                    out.println("Connection timed out, as expected");
                    return;
                } else {
                    throw x;
                }
            }
        }
}
}
