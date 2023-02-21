public class A{
	public static void expandAll( JTree tree, TreePath path ){
		Object node = path.getLastPathComponent();
		TreeModel model = tree.getModel();
		if( model.isLeaf( node ) )return;

		tree.expandPath( path );
		int num = model.getChildCount( node );
		for( int i = 0; i < num; i++ )expandAll( tree, path.pathByAddingChild( model.getChild( node, i ) ) );
	}
}