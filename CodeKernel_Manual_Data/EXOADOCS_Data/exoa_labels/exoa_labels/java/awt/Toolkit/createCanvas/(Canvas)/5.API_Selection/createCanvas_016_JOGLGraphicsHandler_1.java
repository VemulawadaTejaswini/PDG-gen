public class A{
	public MLSceneGraphInterface createSceneDependency(GraphInterface g) {
		System.out.println("createSceneDependency(GraphInterface g, LayoutInterface layout)");
		if (g == null) {
			VDebug.printlnErrMessage("GraphicsHandler: DataGraph==null");
			return null;
		}
		currentMLSceneGraphDependency = createSceneGraph(g);
		interactionDependency = createCanvas(currentMLSceneGraphDependency);
		return currentMLSceneGraphDependency;
	}
}