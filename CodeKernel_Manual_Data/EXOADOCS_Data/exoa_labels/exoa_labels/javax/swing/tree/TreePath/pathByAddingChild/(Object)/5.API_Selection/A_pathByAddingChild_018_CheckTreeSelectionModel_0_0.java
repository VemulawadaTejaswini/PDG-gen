public class A{
	//...
	public static void main(){
		TreePath parent = path.getParentPath();
		//...
		Object childNode = model.getChild(parentNode, i);
		//...
		if(!isPathSelected(parent.pathByAddingChild(childNode)))return false;
	}
}