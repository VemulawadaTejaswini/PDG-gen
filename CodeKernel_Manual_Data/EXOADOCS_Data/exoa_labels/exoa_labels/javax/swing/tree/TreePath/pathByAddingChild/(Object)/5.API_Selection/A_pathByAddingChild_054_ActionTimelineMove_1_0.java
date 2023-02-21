public class A{
	//...
	public static void main(){
		TreePath                new_path;
		//...
		while ( nodes.hasMoreElements() )new_path = new_path.pathByAddingChild( nodes.nextElement() );
	}
}