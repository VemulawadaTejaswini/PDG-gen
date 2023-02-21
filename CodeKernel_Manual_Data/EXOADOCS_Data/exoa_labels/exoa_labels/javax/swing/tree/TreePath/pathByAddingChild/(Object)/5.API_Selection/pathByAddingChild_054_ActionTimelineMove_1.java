public class A{
	private TreePath getReplacedPath( TreePath prefix_path, TreePath old_path ){
		TreePath                new_path;
		MutableTreeNode         common_node;
		DefaultMutableTreeNode  last_node;
		Enumeration             nodes;
		
		common_node = (MutableTreeNode) prefix_path.getLastPathComponent();
		new_path    = prefix_path.getParentPath();
		last_node   = (DefaultMutableTreeNode) old_path.getLastPathComponent();
		nodes       = last_node.pathFromAncestorEnumeration( common_node );
		while ( nodes.hasMoreElements() )new_path = new_path.pathByAddingChild( nodes.nextElement() );

		return new_path;
	}
}