public class A{
	//...
	public static void main(){
		SelectionKey readKey =s.getChannel().register( this.selector,SelectionKey.OP_READ|SelectionKey.OP_WRITE  );
	}
}