public class func{
public void validateHost(InetAddress host){
            ss.bind(new InetSocketAddress(host, 0));
            s1 = new Socket(host, ss.getLocalPort());
            s2 = ss.accept();
            if (s2 != null) {
                try {
                    s2.close();
                } catch (IOException e) {
                }
            }
            if (s1 != null) {
                try {
                    s1.close();
                } catch (IOException e) {
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                }
            }
}
}
