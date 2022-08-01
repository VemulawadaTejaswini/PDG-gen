//37
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.getPopupComponent(User user,Project project)#0{
    panel.add(new BoldLabel(StringUtil.getMsg("0.from.1", getTitle(), user.getDisplayName())), BorderLayout.NORTH);
    ComponentConsoleView componentConsoleView = new ComponentConsoleView(user, project);
    outputMessage(componentConsoleView);
    panel.add(componentConsoleView.getComponent());
}
}
