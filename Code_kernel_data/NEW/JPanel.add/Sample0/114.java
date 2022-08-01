//113
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class450.installActionGroupInToolBar(DefaultActionGroup actionGroup,JPanel toolBarPanel,ActionManager actionManager,String toolbarName,boolean horizontal)#0{
        JComponent actionToolbar = ActionManager.getInstance().createActionToolbar(toolbarName, actionGroup, horizontal).getComponent();
        toolBarPanel.add(actionToolbar, BorderLayout.CENTER);
}
}
