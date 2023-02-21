public class A{
	//...
	public static void main(){
		final DatagramChannel datagramChannel = DatagramChannel.open();
		//...
		datagramChannel.connect(remoteLocal[0]);
	}
}