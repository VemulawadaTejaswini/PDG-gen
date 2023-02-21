public class A{
	public TreePath getChildNode(TreePath path, int index){
		Object child = getModel().getChild(path.getLastPathComponent(), index);
		return path.pathByAddingChild(child);
	}
}