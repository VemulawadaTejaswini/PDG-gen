//125
public class func{
public void read(Socket socket,Class messageClass){
        logger.trace("read message", messageClass, socket.getInputStream().available());
        InputStreamReader reader = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(reader);
        String json = br.readLine();
        logger.trace("read json", json); 
}
}
