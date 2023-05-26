public class func{
public void fetch(SSLSocketFactory socketFactory,String host,int port,boolean secure,String path,int outerLoop,int innerLoop,int delay,int timeout){
                        String line = input.readLine();
                        if (line == null) {
                            throw new IOException("No response from server");
                        }
                        while (line != null && line.length() != 0) {
                            int dot = line.indexOf(':');
                            if (dot != -1) {
                                String key = line.substring(0, dot).trim();
                                String value = line.substring(dot + 1).trim();
                                if ("Content-Length".equalsIgnoreCase(key)) {
                                    length = Integer.valueOf(value);
                                } else if ("Transfer-Encoding".equalsIgnoreCase(key)) {
                                    chunked = "Chunked".equalsIgnoreCase(value);
                                }
                            }
                            line = input.readLine();
                        }
                        assertTrue("Need either content length or chunked encoding", length != -1
                                || chunked);
                        if (chunked) {
                            length = Integer.parseInt(input.readLine(), 16);
                            while (length != 0) {
                                byte[] buffer = new byte[length];
                                input.readFully(buffer);
                                input.readLine();
                                length = Integer.parseInt(input.readLine(), 16);
                            }
                            input.readLine();
                        } else {
                            byte[] buffer = new byte[length];
                            input.readFully(buffer);
                        }
                    input.close();
}
}
