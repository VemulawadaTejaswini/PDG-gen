//278
public class func{
	public void testNetwork(){
            final InetSocketAddress socketAddress = new InetSocketAddress(address, port);
                Thread t = new Thread() {
                    @Override
                    public void run() {
                        try {
                            socket.connect(socketAddress, 2000);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                };
                t.start();
                t.join(5000);
}
}
