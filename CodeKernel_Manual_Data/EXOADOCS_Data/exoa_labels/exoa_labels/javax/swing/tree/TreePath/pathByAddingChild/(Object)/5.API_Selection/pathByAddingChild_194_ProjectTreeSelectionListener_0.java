public class A{
	private TreePath buildPathFrom(TreeModelEvent evt, Object child) {
		return evt.getTreePath().pathByAddingChild(child);
	}
}