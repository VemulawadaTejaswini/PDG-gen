public class A{
	private void genChildrenNodeViews(TreePath parentPath,ArrayList resArrayList){
		//...
		Object childNode = ivModel.getChild(parentPath.getLastPathComponent(), index);
		TreePath childNodePath = parentPath.pathByAddingChild(childNode);
	}
}