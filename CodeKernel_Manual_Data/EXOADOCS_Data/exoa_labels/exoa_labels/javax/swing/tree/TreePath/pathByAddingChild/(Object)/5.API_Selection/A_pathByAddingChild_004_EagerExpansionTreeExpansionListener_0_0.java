public class A{
	//...
	public static void main(){
		TreePath path = event.getPath();
		//...
		tree.expandPath(path.pathByAddingChild(treeNode.getChildAt(0)));
	}
}