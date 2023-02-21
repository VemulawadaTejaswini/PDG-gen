public class A{
	//...
	public static void main(){
		TreePath parentPath = new TreePath(finalPath.getPathComponent(0));
		//...
		TreePath curPath = parentPath.pathByAddingChild(finalPath.getPathComponent(i));
	}
}