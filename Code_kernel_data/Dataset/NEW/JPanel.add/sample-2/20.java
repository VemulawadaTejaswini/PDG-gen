//20
public class func{
public void createCenterPanel(){
    JPanel panel = new JPanel(new BorderLayout());
    panel.add(myTreeList, BorderLayout.CENTER);
    DefaultActionGroup actionGroup = new DefaultActionGroup(myTreeList.getTreeActions());
}
}
