public class A{
	public synchronized SelectionKey register(SelectableChannel selectable, SelectionListener listener)throws IOException{
		//...
		Selector selector = controller.getSelector();
		//...
		SelectionKey key = selectable.register(selector, SelectionKey.OP_READ);
	}
}