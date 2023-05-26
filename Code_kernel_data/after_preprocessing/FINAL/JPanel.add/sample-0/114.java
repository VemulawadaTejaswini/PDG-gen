public class func{
public void MyConsolePanel(ExecutionConsole consoleView,ActionGroup toolbarActions){
      toolbarPanel.add(ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, toolbarActions,false).getComponent());
      add(toolbarPanel, BorderLayout.WEST);
}
}
