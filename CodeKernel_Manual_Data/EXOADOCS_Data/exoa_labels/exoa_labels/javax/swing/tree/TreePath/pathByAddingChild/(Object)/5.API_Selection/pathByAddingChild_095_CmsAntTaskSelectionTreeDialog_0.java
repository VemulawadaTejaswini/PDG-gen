public class A{
	private void expandTree(TreePath treePath) {
		
		if (treePath.getPathCount() == m_promptTask.getExpansionLevels()) {
			m_tree.expandPath(treePath);
			
		} else {
			DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode)treePath.getLastPathComponent();
			Enumeration children = treeNode.children();
			while (children.hasMoreElements()) {
				expandTree(treePath.pathByAddingChild(children.nextElement()));
			}
		}
		
	}
}