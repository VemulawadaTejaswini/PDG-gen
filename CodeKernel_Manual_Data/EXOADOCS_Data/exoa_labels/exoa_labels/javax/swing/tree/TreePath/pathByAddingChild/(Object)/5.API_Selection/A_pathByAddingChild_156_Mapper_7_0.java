public class A{
	//...
	public static void main(){
		TreePath path = new TreePath(getMapping().getRoot());
		//...
		collapseRecursively(path.pathByAddingChild(getMapping().getChild(node, i)));
	}
}