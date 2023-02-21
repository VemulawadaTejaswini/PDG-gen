public class A{
	public SelectorOutputStream(WritableByteChannel writable,SelectableChannel selectable) throws IOException {
		this.writable = writable;
		if (selectable != null) {
			selector = Selector.open();
			selectable.configureBlocking(false);
			selectable.register(selector, SelectionKey.OP_WRITE);
		} else {
			selector = null;
		}
	}
}