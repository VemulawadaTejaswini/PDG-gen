public class A{
	//...
	public static void main(){
		TreePath returnPath = new TreePath(parent);
		//...
		Object val = mdl.getChild(parent,iChild);
		//...
		returnPath = returnPath.pathByAddingChild(val);
	}
}