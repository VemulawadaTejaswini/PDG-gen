public class func{
public void createCeckbox(final JPanel panel,boolean enabled){
        JCheckBox checkBox = new JCheckBox();
        checkBox.setHorizontalAlignment(SwingConstants.CENTER);
        checkBox.setEnabled(enabled);
        panel.add(checkBox);
}
}
