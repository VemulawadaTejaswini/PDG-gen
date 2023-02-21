public class A{
	public static void expandAll( JTree tree, TreePath path ){
		//...
		for( int i = 0; i < num; i++ )expandAll( tree, path.pathByAddingChild( model.getChild( node, i ) ) );
	}
}