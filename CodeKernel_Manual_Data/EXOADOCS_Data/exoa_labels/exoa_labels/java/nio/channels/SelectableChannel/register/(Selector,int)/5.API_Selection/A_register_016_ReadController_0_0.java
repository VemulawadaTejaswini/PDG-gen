public class A{
	//...
	public static void main(){
		Selector auxSelector = selectorHandler.getSelector();
		SelectableChannel channel = record.channel;
		SelectionKey readKey =channel.register(auxSelector, SelectionKey.OP_READ);
	}
}