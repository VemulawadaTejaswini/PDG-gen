//115
public class func{
	public void serve(InputStream inputStream){
        while (!(a.equals("===quit"))) {
            a = br.readLine();
            logger.info("Received WebSocket Message {}", a);
            processor.invokeWebSocketProtocol(webSocket(inputStream), a);
        }
}
}
