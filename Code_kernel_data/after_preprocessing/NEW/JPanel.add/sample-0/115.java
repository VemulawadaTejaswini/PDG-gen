//115
public class func{
public void createCenterPanel(){
    panel.add(ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actionGroup, true).getComponent(), BorderLayout.NORTH);
    myTreeList.expandAll();
}
}
