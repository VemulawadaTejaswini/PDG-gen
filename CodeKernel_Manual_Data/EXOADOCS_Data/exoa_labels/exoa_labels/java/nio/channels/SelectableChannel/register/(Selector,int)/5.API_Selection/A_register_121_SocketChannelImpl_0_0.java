public class A{
	//...
	public static void main(){
		Selector selector = provider().openSelector();
		register(selector, SelectionKey.OP_CONNECT);
	}
}