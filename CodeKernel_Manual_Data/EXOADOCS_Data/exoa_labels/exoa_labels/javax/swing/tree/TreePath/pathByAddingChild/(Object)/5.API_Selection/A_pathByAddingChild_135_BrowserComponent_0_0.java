public class A{
	//...
	public static void main(){
		TreePath path = treePane.getPathForCategory(category);
		//...
		path = path.pathByAddingChild(lastNode.getChildAt(childIndex));
	}
}