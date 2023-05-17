//178
public class func{
public void createCenterPanel(){
    splitter.setFirstComponent(new JBScrollPane(myRequestsTable, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));
    splitter.setSecondComponent(
      new JBScrollPane(myStacktrace, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));
    panel.add(splitter, BorderLayout.CENTER);
}
}
