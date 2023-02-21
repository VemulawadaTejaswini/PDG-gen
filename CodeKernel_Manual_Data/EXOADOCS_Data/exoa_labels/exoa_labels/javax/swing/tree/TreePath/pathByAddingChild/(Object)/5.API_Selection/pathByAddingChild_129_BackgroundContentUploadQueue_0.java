public class A{
	private static boolean initializeTasksCollection(Collection tasks,int treeType, TaskType type, TreeSource src, TreePath path,CategoryElement ce) {
		if (path == null)return false;
		if (ce == null)return false;
		if (!ce.isDownloaded()) {
			tasks.add(ContentUploadTask.createTask(type, treeType, src, path));
		}
		Iterator it = ce.getCategories();
		if (it == null) {
			return true;
		}
		Object obj;
		while (it.hasNext()) {
			obj = it.next();
			if (obj != null && obj instanceof CategoryElement) {
				initializeTasksCollection(tasks, treeType, type, src, path.pathByAddingChild(obj), (CategoryElement) obj);
			}
		}
		return true;
	}
}