public class func{
public void doit(){
        URL r = Thread.currentThread().getContextClassLoader().getResource("/org/apache/aries/spifly/test/blah.txt");
        System.out.println("*** First line of content: " + new BufferedReader(new InputStreamReader(r.openStream())).readLine());
}
}
