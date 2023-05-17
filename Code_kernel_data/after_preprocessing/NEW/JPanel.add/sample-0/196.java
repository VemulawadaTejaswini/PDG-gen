//196
public class func{
public void buildQueryMatchPanel(){
        JSplitPane splitPane = UISupport.createHorizontalSplit(buildQueryEditor(), buildMatchEditor());
        panel.add(splitPane, BorderLayout.CENTER);
        splitPane.setDividerLocation(200);
}
}
