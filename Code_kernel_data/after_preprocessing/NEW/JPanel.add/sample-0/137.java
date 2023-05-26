//137
public class func{
public void createMutationsPanel(){
        JSplitPane mainSplit = UISupport.createHorizontalSplit(buildFilesList(), buildTables());
        mainSplit.setResizeWeight(1);
        panel.add(mainSplit, BorderLayout.CENTER);
}
}
