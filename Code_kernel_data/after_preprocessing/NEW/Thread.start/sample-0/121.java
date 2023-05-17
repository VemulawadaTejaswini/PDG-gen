//121
public class func{
public void GroovyClientConnection(Script script,boolean autoOutput,Socket socket){
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());
            new Thread(this, "Groovy client connection - " + socket.getInetAddress().getHostAddress()).start();
}
}
