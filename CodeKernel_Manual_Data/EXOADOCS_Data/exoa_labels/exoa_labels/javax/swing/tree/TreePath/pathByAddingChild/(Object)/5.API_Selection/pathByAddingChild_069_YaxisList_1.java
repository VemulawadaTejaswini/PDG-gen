public class A{
	public void treeNodesInserted( TreeModelEvent evt ){
		TreePath      parent_path;
		Object []     children;
		int []        child_indices;
		TreePath      child_path;
		int           row_idx, idx;
		
		parent_path    = evt.getTreePath();
		children       = evt.getChildren();
		child_indices  = evt.getChildIndices();
		
		for ( idx = 0; idx < children.length; idx++ ) {
			child_path = parent_path.pathByAddingChild( children[ idx ] );
			row_idx = tree_view.getRowForPath( child_path );
			if ( Debug.isActive() )Debug.println( "treeNodesInserted(): " + child_path+ " at row " + row_idx );
			if ( row_idx >= 0 )list_data.add( row_idx, tree_view.getNamedVtr( child_path ) );
			elselist_data.add( tree_view.getNamedVtr( child_path ) );
		}
		
		super.setListData( (Vector) list_data );
		scroller.revalidate();
		scroller.repaint();
	}
}