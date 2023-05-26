//25
public class func{
public void execute(String command){
    socket.connect(new InetSocketAddress(_viewServerHost, _viewServerPort));
      BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
          socket.getOutputStream()));
      BufferedReader in = new BufferedReader(new InputStreamReader(
          socket.getInputStream(), "utf-8"));
}
}
