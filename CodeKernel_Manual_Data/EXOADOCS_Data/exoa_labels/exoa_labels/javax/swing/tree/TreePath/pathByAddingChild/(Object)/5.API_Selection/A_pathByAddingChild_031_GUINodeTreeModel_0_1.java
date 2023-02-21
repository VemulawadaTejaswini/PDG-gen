public class A{
	//...
	public static void main(){
		parentPath = parentPath == null? new TreePath(crtChild): parentPath.pathByAddingChild(crtChild);
		childPath = parentPath.pathByAddingChild(newChildren.get(0));
	}
}