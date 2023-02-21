public class A{
	private int getRowOffsetToChild(TreePath parent, int childIndex){
		//...
		TreePath child = parent.pathByAddingChild(ivModel.getChild(parent.getLastPathComponent(), index));
	}
}