public class A{
	public static void sendMessage(Message message) {
		Socket socket = null;
		ObjectOutputStream oos = null;
		try {
			socket = new Socket();
			socket.connect(message.getTarget());
			
			oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(message);
		} catch (IOException e) {
			logger.error("Unable to comunicate to Hub", e);
		} finally {
			if (oos != null)try {
				oos.flush();
				oos.close();
			} catch (IOException e) {
			}
			if (socket != null)try {
				socket.close();
			} catch (IOException e) {
			}
		}
	}
}