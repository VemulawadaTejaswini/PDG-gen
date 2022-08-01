//53
public class func{
	public void run(){
                            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                            BufferedReader in = new BufferedReader(new InputStreamReader( socket.getInputStream()));
                                int read = in.read(buffer);
                                if (read == TOKEN_SIZE) {
                                    inputLine = new String(buffer);
                                    if (inputLine.equals(getAccessToken())) {
                                        log.debug("Client authorized");
                                        out.println(getSystemInfo());
                                        log.debug("SystemInfo returned");
                                        setAccessToken(); // regenerate
                                     }
                                    else {
                                        log.debug("Invalid token recieved");
                                        out.println("Bye!");
                                    }
                                }
                                else {
                                    log.debug("Invalid token recieved");
                                    out.println("Bye!");
                                }
}
}
