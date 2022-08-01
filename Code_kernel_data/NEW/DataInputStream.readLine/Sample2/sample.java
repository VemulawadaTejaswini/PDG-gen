//0
public class func{
	public void HTTPConnectSocket(String host,int port,String proxyHost,int proxyPort){
    DataInputStream is = new DataInputStream(getInputStream());
    String str = is.readLine();
    if (!str.startsWith("HTTP/1.0 200 ")) {
      if (str.startsWith("HTTP/1.0 "))
  str = str.substring(9);
      throw new IOException("Proxy reports \"" + str + "\"");
    }
    do {
      str = is.readLine();
    } while (str.length() != 0);
}
}
//1
public class func{
	public void getPath(DataInputStream in){
        String line = in.readLine();
        if (line.startsWith("GET /")) {
            line = line.substring(5, line.length()-1).trim();
            int index = line.indexOf(' ');
            if (index != -1) {
                path = line.substring(0, index);
            }
        }
        do {
            line = in.readLine();
        } while ((line.length() != 0) &&
                 (line.charAt(0) != '\r') && (line.charAt(0) != '\n'));
}
}
//2
public class func{
	public void readPGM(InputStream is){
    DataInputStream dis = new DataInputStream(is);
    String p5 = dis.readLine();
    if (!p5.equals("P5")) {
      throw new IOException("Only P5 is supported");
    }
    String depth = dis.readLine();
    String[] tmp = dim.split(" ");
    int height = Integer.parseInt(tmp[1]);
    int read = dis.read(buf, 0, width * height);
    if (read != width * height) {
      throw new IOException("Could not read data fully");
    }
    for (int i = 0; i < width * height; i++) {
      y[i] = buf[i] & 0xff;
    }
    return new Picture(width, height, new int[][] {y}, ColorSpace.GREY);
}
}
//3
public class func{
	public void parseHeader(DataInputStream in){
      header.file = decodeWebChars(strs[1]);
      if (header.file != null) {
        header.file = URLDecoder.decode(header.file, ISO_8859_1);

        header.parseGetParams();
      }
    line = in.readLine();
    while (line != null) {
      if (line.isEmpty()) {
        break;
      }

      int index = line.indexOf(':');

      if (index == -1) {
        header.headers.put(line, "");
      } else {
        header.headers.put(line.substring(0, index), line.substring(index + 1).trim());
      }

      line = in.readLine();
    }
}
}
//4
public class func{
	public void fetch(SSLSocketFactory socketFactory,String host,int port,boolean secure,String path,int outerLoop,int innerLoop,int delay,int timeout){
                        String line = input.readLine();
                        if (line == null) {
                            throw new IOException("No response from server");
                            // android.util.Log.d("SSLSocketTest", "No response from server");
                        }
                        while (line != null && line.length() != 0) {
//                    System.out.println(line);
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
//5
public class func{
	public void connect(){
    String line = dataInput.readLine();
    if (line == null) {
      throw new IOException();
    }
    parseHeaderLine(line);
    line = dataInput.readLine();
    while (line != null && line.length() > 0) {
      String[] strs = line.split(":");

      if (strs.length >= 2) {
        putHeaderField(strs[0], strs[1]);
      }

      line = dataInput.readLine();
    }
}
}
//6
public class func{
	public void receive(InputStream is){
    int code = is.read();
    if (code == -1) {
      throw new EOFException();
    }
    switch (code) {
      case StatusReply.MARKER: {
        return new StatusReply(new DataInputStream(is).readLine());
      }
      case ErrorReply.MARKER: {
        return new ErrorReply(new DataInputStream(is).readLine());
      }
      case IntegerReply.MARKER: {
        return new IntegerReply(readLong(is));
      }
      case BulkReply.MARKER: {
        return new BulkReply(readBytes(is));
      }
      case MultiBulkReply.MARKER: {
        return new MultiBulkReply(is);
      }
      default: {
        throw new IOException("Unexpected character in stream: " + code);
      }
    }
}
}
//7
public class func{
	public void run(){
                    System.out.println(" RECIVER Got : " +  is.readLine());
}
}
//8
public class func{
	public void EventReader(DataInputStream in){
    this.version = in.readLine();
}
}
//9
public class func{
	public void EventReader(DataInputStream in){
    this.version = in.readLine();
}
}
//10
public class func{
	public void run(){
                    System.out.println(" Sender Got : " +  is.readLine() );
}
}
