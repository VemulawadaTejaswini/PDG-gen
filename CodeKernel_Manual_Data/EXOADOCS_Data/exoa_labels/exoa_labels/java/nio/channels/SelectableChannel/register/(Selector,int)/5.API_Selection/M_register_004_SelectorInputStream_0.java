public class A{
	public SelectorInputStream(ReadableByteChannel readable,SelectableChannel selectable) throws IOException {
		selector = Selector.open();
		this.readable = readable;
		this.selectable = selectable;
		this.selectable.configureBlocking(false);
		this.selectable.register(selector, SelectionKey.OP_READ);
	}
}