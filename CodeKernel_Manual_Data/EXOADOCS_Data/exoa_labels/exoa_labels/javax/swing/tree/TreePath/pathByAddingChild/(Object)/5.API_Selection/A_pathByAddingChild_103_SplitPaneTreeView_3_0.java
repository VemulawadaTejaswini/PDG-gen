public class A{
	//...
	public static void main(){
		TreePath p = l.getPath();
		//...
		for(int j = 0; j < idxs.length; j++)if(idxs[j] < l.getModel().getSize())selection.add(p.pathByAddingChild(l.getModel().getElementAt(idxs[j])));
	}
}