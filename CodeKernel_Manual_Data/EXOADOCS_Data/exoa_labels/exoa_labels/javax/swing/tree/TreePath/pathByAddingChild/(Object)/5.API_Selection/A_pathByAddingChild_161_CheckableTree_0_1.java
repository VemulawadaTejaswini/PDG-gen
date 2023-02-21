public class A{
	//...
	public static void main(){
		TreePath parent = event.getPath();
		//...
		Object obj2;
		//...
		CheckableTree.this.setExpandedState(parent.pathByAddingChild(obj2), true);
	}
}