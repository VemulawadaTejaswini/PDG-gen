public class func{
public void getJMXUrl(String broker){
            sock.connect(new InetSocketAddress(broker, 7676));
            for(String line : IOUtils.toString(sock.getInputStream()).split("\n")) {
                if(line.startsWith("jmxrmi rmi JMX")) {
                    url = line.substring(line.indexOf('=') + 1, line.length() - 1);
                    break;
                }
            }
            logger.info("jmxurl of broker {} = {}", broker, url);
}
}
