//127
public class func{
public void createPanel(){
    textWithComboPanel.add(Box.createRigidArea(JBUI.size(5, 0)));
    textWithComboPanel.add(myForceRearrangeComboBox);
    group.add(textWithComboPanel);
    return group.createPanel();
}
}
