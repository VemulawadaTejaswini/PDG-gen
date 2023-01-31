//23
public class func{
	public void migrate(){
                        sock.connect(new InetSocketAddress(brk.getHost(), Integer.parseInt(brk.getPort())));
                        BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                        for(wait_cnt = 0; wait_cnt < 20 && !in.ready(); wait_cnt++) {
                            Utils.justSleep(500);
                        }
                        if(in.ready()) {
                            if(brk.getBrokerType().equals("openmq")) {
                                String line = in.readLine();
                                if(line.startsWith("101 imqbroker"))
                                    hasOld = true;
                            }
                        }
}
}
