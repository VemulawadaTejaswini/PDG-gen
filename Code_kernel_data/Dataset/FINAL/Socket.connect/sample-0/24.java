public class func{
public void checkAgentConnection(AgentInstallInfo info,int retries){
        if (info.getAgentPort() > 0) {
            info.setConfirmedAgentConnection(false);
            for (int attempt = 0; attempt < retries && !info.isConfirmedAgentConnection(); attempt++) {
                Socket ping = new Socket();
                try {
                    ping.connect(new InetSocketAddress(info.getAgentAddress(), info.getAgentPort()), 5000);
                    info.setConfirmedAgentConnection(ping.isConnected());
                } catch (Exception e) {
                    info.setConfirmedAgentConnection(false);
                } finally {
                    try {
                        ping.close();
                    } catch (Exception ignore) {
                    }
                }
            }
        } else {
            info.setConfirmedAgentConnection(false);
        }
        return info.isConfirmedAgentConnection();
}
}
