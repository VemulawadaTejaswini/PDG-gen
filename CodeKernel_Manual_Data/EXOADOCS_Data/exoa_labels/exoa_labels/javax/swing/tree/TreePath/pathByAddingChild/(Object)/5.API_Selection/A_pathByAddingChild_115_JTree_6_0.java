public class A{
	//...
	public static void main(){
		TreePath temp = new TreePath(oPath[0]);
		//...
		while (isVisible(temp))if (i < oPath.length)temp = temp.pathByAddingChild(oPath[i++]);
	}
}