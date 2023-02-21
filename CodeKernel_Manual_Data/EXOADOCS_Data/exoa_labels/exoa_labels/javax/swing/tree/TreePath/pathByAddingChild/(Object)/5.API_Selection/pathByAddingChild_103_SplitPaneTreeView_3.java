public class A{
	public TreePath[] getSelectionPaths() {
		HashSet selection = new HashSet();
		
		for(int i = 0; i < paneCount; i++) {
			NodeList l = nodeListAt(i);
			TreePath p = l.getPath();
			if(p == null) break;
			
			int[] idxs = l.getSelectedIndices();
			for(int j = 0; j < idxs.length; j++)if(idxs[j] < l.getModel().getSize())selection.add(p.pathByAddingChild(l.getModel().getElementAt(idxs[j])));
		}
		
		TreePath[] tmp = (TreePath[])selection.toArray(new TreePath[selection.size()]);
		for(int i = 0; i < tmp.length; i++)if(selection.contains(tmp[i].getParentPath()))selection.remove(tmp[i].getParentPath());

		return (TreePath[])selection.toArray(new TreePath[selection.size()]);
	}
}