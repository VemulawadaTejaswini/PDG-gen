//74
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.createCombinePanel()#0{
        final JComboBox combineComboBox = new JComboBox();
        bindingCtx.bind("combine", combineComboBox);
        bindingCtx.bindEnabledState("combine", false, "updateMode", true);
        final String displayName = bindingCtx.getPropertySet().getDescriptor("combine").getDisplayName();
        combinePanel.add(new JLabel(displayName + ":"));
        combinePanel.add(combineComboBox);
}
}
