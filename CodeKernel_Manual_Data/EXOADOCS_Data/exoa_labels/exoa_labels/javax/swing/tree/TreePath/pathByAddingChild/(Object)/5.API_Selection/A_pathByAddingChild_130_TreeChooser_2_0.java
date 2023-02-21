public class A{
	//...
	public static void main(){
		TreePath path = new TreePath( getModel().getRoot() );
		//...
		path = path.pathByAddingChild( items[i] );
	}
}