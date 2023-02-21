public class A{
	//...
	public static void main(){
		TreePath path = new TreePath(getMapping().getRoot());
		//...
		expandRecursively(path.pathByAddingChild(getMapping().getChild(node, i)));
	}
}