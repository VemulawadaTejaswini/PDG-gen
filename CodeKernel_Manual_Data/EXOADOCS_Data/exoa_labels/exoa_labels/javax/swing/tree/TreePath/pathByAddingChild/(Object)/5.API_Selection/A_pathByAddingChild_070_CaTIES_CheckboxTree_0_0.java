public class A{
	public static void selectAll( JTree tree, TreePath path, boolean value ){
		//...
		selectAll( tree,path.pathByAddingChild( model.getChild( node, i ) ),value );
	}
}