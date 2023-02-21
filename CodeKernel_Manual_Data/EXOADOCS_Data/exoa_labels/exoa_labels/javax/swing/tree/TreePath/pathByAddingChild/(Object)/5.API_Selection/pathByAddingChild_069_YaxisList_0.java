public class A{
	public void treeExpanded( TreeExpansionEvent evt ){
		TreePath      node_path;
		TreePath      child_path;
		Enumeration   children;
		Object        child;
		String        label;
		int           row_idx;
		
		node_path   = evt.getPath();
		children    = ( (TreeNode) node_path.getLastPathComponent() ).children();

		row_idx = tree_view.getRowForPath( node_path );
		if ( Debug.isActive() )Debug.println( "treeExpanded(): " + node_path+ " at row " + row_idx );
		if ( row_idx >= 0 && row_idx < list_data.size() )list_data.set( row_idx, tree_view.getNamedVtr( node_path ) );
		elselist_data.add( tree_view.getNamedVtr( node_path ) );

		while ( children.hasMoreElements() ) {
			child = children.nextElement();
			child_path = node_path.pathByAddingChild( child );
			row_idx = tree_view.getRowForPath( child_path );
			if ( Debug.isActive() ) {
				Debug.println( "treeExpanded(): " + child_path + "'s level = "+ ( (DefaultMutableTreeNode) child ).getLevel() );
				Debug.println( "treeExpanded(): " + child_path + " at row = "+ row_idx);
			}
			if ( row_idx >= 0 && row_idx < list_data.size() )list_data.add( row_idx, tree_view.getNamedVtr( child_path ) );
			elselist_data.add( tree_view.getNamedVtr( child_path ) );
			if ( tree_view.isExpanded( child_path ) )tree_view.fireTreeExpanded( child_path );
		}
		
		super.setListData( (Vector) list_data );
		scroller.revalidate();
		scroller.repaint();
	}
}