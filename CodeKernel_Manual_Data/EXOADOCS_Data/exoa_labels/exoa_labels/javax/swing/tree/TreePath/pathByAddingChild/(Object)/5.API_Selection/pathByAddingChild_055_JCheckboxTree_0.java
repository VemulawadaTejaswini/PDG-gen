public class A{
	public static void selectAll( JTree tree, TreePath path, boolean value ){
		Object node = path.getLastPathComponent();
		TreeModel model = tree.getModel();
		if( model.isLeaf( node ) )return;

		if( node instanceof CheckBoxTreeNode )((CheckBoxTreeNode)node).setSelected( value );

		int num = model.getChildCount( node );
		for( int i = 0; i < num; i++ ){
			selectAll( tree,path.pathByAddingChild( model.getChild( node, i ) ),value );
		}
	}
}