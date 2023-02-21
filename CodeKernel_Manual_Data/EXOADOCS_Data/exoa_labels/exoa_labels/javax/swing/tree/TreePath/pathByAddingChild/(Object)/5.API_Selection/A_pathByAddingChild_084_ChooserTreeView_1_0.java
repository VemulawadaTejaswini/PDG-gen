public class A{
	//...
	public static void main(){
		Object n = content.getModel().getElementAt(idx);
		if(!tree.isLeaf(n))pathView.setPath(pathView.getPath().pathByAddingChild(n));
	}
}