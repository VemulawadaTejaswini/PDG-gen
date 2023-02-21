public class A{
	public void setSelectedItem(Object anItem){
		if ( ! (treeChooser.displayPath.getLastPathComponent().equals( anItem ) ) ){
			Object[] items = treeChooser.displayPath.getPath();
			TreePath path = new TreePath( getModel().getRoot() );
			for ( int i = 1; i < items.length; i++ ){
				if ( path.getLastPathComponent() == anItem ){
					treeChooser.setDisplayPath( path );
					return;
				}
				path = path.pathByAddingChild( items[i] );
			}
		}
	}
}