//20
public class func{
	public void main(String args[]){
        int port = Integer.parseInt(portStr);
        socket.connect(new InetSocketAddress("127.0.0.1", port), 9 * 1000);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
        for(int i=0;i<90;i++)
        {
          out.write("{\"type\":\"getcommand\"}");
          out.newLine();
          out.flush();
          String line = in.readLine();
          if(line.equalsIgnoreCase("getelement"))
          {
            System.out.print("getelement");
            break;
          }
          Thread.sleep(100);
        }
}
}
