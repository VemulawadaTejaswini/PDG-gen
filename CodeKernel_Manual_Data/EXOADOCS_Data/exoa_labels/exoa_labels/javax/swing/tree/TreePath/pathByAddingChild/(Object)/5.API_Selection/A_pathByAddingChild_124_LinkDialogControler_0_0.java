public class A{
	//...
	public static void main(){
		TreePath selectionPath = new TreePath(view.getTree().getModel().getRoot());
		//...
		Object o = it.next();
		//...
		selectionPath = selectionPath.pathByAddingChild(o);
	}
}