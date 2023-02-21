public class A{
	public MLSceneGraphInterface createScene(GraphInterface g) {
		System.out.println("createScene(GraphInterface g, LayoutInterface layout)");
		if (g == null) {
			VDebug.printlnErrMessage("GraphicsHandler: DataGraph==null");
			return null;
		}
		currentMLSceneGraph = createSceneGraph(g);
		interaction = createCanvas(currentMLSceneGraph);
		return currentMLSceneGraph;
	}
}