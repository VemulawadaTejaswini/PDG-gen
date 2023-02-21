public class A{
	private TreePath expandTree( TreePath aPath, Expander aExpander ){
		//...
		TreePath aRet = expandTree(aPath.pathByAddingChild( aNode.getChild( i ) ),aExpander );
	}
}