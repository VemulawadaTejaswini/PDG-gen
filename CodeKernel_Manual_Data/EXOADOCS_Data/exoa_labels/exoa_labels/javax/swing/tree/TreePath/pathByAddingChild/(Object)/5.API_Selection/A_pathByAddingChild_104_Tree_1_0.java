public class A{
	//...
	public static void main(){
		TreePath jTreePath = getTreePath(parentPath);
		Object child = jTree.getModel().getChild(jTreePath.getLastPathComponent(), childIndex);
		return jTreePath.pathByAddingChild(child);
	}
}