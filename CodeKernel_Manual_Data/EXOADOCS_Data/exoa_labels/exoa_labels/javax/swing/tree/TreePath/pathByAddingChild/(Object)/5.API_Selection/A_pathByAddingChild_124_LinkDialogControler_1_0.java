public class A{
	protected TreePath getPathforObject(TreePath parentPath, Object o){
		//...
		return parentPath.pathByAddingChild(o);
	}
}