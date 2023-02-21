public class A{
	//...
	public static void main(){
		SelectableChannel myChannel =(SelectableChannel) myNewChannels.next();
		SelectionKey myKey =myChannel.register(_selector,SelectionKey.OP_READ);
	}
}