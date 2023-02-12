public class func{
public void maybeInitJmx(){
                ServerSocket ss = new ServerSocket();
                ss.setReuseAddress(true);
                ss.bind(null);
                int jmxport = ss.getLocalPort();
                ss.close();
                if (jmxport == -1) {
                    log.warn("[init.jmx] failed to get a port");
                } else {
                    try {
                        jmxremote = new MBeanRemotingSupport(jmxport);
                        jmxremote.start();
                        log.info("[init.jmx] port={}", jmxport);
                    } catch (Exception e) {
                        log.error("[init.jmx]", e);
                    }
                }
}
}
