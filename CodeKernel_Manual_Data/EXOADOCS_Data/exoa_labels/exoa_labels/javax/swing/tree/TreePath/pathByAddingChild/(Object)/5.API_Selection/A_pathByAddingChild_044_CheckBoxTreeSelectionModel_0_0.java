public class A{
	//...
	public static void main(){
		TreePath parent = path.getParentPath();
		//...
		Object childNode = _model.getChild(parentNode, i);
		//...
		TreePath childPath = parent.pathByAddingChild(childNode);
	}
}