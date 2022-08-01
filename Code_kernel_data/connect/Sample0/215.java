//214
public class func{
	public void doCallbackConnection(int callbackPort,ClassTransformer t){
      callback.connect(new InetSocketAddress("localhost", callbackPort));
      AgentClientConnection clientConnection = new AgentClientConnection(
                                                                         callback,
                                                                         t);
      AgentServer.addClientConnection(clientConnection);
      clientConnection.start(1);
      clientConnection.waitForTraceConn();
}
}
