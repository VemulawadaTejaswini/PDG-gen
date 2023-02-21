public class A{
	private int getRowOffsetToChild(TreePath parent, int childIndex){

		int offset = 0;
		for (int index = 0; index < childIndex; index++){
			TreePath child = parent.pathByAddingChild(ivModel.getChild(parent.getLastPathComponent(), index));
			
			if (isExpanded(child)){
				offset += getRowOffsetToChild(child, ivModel.getChildCount(child.getLastPathComponent()));
			}
			offset += getTreeNodeView(child).getRows().size();
		}
		return offset;
	}
}