public class A{
	private boolean initialize(TreeSource src, TreePath path, CategoryElement ce) {
		if (path == null)return false;
		if (ce == null)return false;
		if (!ce.isDownloaded()) {
			this.addNewTask(ContentUploadTask.createTask(type, src, path));
		}
		Iterator it = ce.getCategories();
		if (it == null) {
			if (!hasNextTask())return false;
			return true;
		}
		Object obj;
		while (it.hasNext()) {
			obj = it.next();
			if (obj != null && obj instanceof CategoryElement) {
				initialize(src, path.pathByAddingChild(obj),(CategoryElement) obj);
			}
		}
		return hasNextTask();
	}
}