public class A{
	public SelectorOutputStream(WritableByteChannel writable,SelectableChannel selectable) throws IOException {
		//...
		selectable.register(selector, SelectionKey.OP_WRITE);
	}
}