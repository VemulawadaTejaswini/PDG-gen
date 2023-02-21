public class A{
	public void run() {
		while(keepRunning) {
			if(listening) {
				try {
					System.err.println("Waiting for connection...");
					Socket clientSocket = sSocket.accept();
					System.err.println("Connected! From " + clientSocket);
					DrawerSocket drawSocket = new DrawerSocket(clientSocket);
					Drawer drawer = new Drawer(drawSocket);
					this.clients.add(drawer);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if(isAClient) {
				try {
					System.err.println("Connecting to " + connectToSocket);
					Socket connectTo = new Socket();
					connectTo.connect(this.connectToSocket);
					System.err.println("Conencted to " + connectToSocket);
					this.isAClient = false;
				} catch(Exception e) {
					
				}
			} else {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}