public class A{
	//...
	public static void main(){
		TreePath parentPath=e.getTreePath();
		//...
		Object childNode = children[index];
		TreePath path = parentPath.pathByAddingChild(childNode);
	}
}