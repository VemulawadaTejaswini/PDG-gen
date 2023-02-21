public class A{
	private static boolean initializeTasksCollection(Collection tasks,int treeType, TaskType type, TreeSource src, TreePath path,CategoryElement ce) {
		//...
		Object obj;
		//...
		initializeTasksCollection(tasks, treeType, type, src, path.pathByAddingChild(obj), (CategoryElement) obj);
	}
}