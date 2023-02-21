public class A{
	protected TreePath getPathforObject(TreePath parentPath, Object o){
		//...
		Object child = getChild(parentPath.getLastPathComponent(), i);
		//...
		TreePath path = getPathforObject(parentPath.pathByAddingChild(child), o);
	}
}