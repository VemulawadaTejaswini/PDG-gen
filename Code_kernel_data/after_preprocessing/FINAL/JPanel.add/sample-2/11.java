public class func{
public void createTab(String key){
    JPanel panel = new JPanel(new BorderLayout()); 
    panel.add(contentPanel, BorderLayout.PAGE_START);
    myPanelToKeyMap.put(tab.getKey(), panel);
    myTabbedPane.addTab(tab.getDisplayName(), panel);
    myTabs.add(tab);
}
}
