public class A{
	private void getExpandedNodes(TreePath n, List l) {
		//...
		if (count > 0)for (int i=0; i<count; i++)getExpandedNodes(n.pathByAddingChild(getModel().getChild(n.getLastPathComponent(), i)), l);
	}
}