//21
public class func{
	public void run(IProgressMonitor monitor){
              socket.connect(new InetSocketAddress(host, port), 10000);
              boolean connected = socket.isConnected();
              if (connected)
              {
                OutputStream os = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(os, true);
                writer.println(request);
                writer.flush();
                InputStream is = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String line = reader.readLine();
                if (line != null)
                {
                  setServerState(IServer.STATE_STARTED);
                  serverChanged();
                }
                else
                {
                  setServerState(IServer.STATE_UNKNOWN);
                  serverChanged();
                }
                reader.close();
                writer.close();
                socket.close();
              }
              else
              {
                setServerState(IServer.STATE_UNKNOWN);
                serverChanged();
              }
}
}
