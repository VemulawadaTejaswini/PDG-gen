public class A{
	private boolean register(Selector selector, SelectableChannel channel){
		//...
		SelectableChannel adaptee = channel instanceof AdaptableChannel? (SelectableChannel) ((AdaptableChannel) channel).getAdapteeChannel() : channel;
		//...
		key = adaptee.register(selector, SelectionKey.OP_READ);
	}
}