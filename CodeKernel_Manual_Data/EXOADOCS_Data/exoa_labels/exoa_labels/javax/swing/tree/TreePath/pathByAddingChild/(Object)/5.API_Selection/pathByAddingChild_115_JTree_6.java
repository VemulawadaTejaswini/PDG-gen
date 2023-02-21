public class A{
	public void scrollPathToVisible(TreePath path){
		if (path == null)return;

		Object[] oPath = path.getPath();
		TreePath temp = new TreePath(oPath[0]);
		boolean stop = false;
		int i = 1;
		while (!stop){
			while (isVisible(temp))if (i < oPath.length)temp = temp.pathByAddingChild(oPath[i++]);
			else{
				stop = true;
				break;
			}
			makeVisible(temp);
		}
		Rectangle rect = getPathBounds(path);
		scrollRectToVisible(rect);
		revalidate();
		repaint();
	}
}