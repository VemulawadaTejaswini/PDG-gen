public class A{
	private TreePath expandTree( TreePath aPath, Expander aExpander ){
		TreePath aFirst = null;
		
		
		try{
			Object aObj = aPath.getLastPathComponent();
			
			if( aExpander.expand( aObj ) ){
				maTree.expandPath (aPath);
				if( aFirst == null )aFirst = aPath;
			}
			
			if (aObj instanceof AccessibleTreeNode){
				AccessibleTreeNode aNode = (AccessibleTreeNode)aObj;
				int nLength = aNode.getChildCount();
				for( int i = 0; i < nLength; i++ ){
					TreePath aRet = expandTree(aPath.pathByAddingChild( aNode.getChild( i ) ),aExpander );
					if( aFirst == null )aFirst = aRet;
				}
			}
		}
		catch (Exception e){
			System.out.println ("caught exception while expanding tree path "+ aPath + ": " + e);
			e.printStackTrace ();
		}
		
		return aFirst;
	}
}