public class func{
public void createContentPane(){
        mainPanel.add(createScorePanel(), BorderLayout.SOUTH);
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, quickOpenPanel, mainPanel);
        splitPane.setOneTouchExpandable(true);
        splitPane.setResizeWeight(0.2);
}
}
