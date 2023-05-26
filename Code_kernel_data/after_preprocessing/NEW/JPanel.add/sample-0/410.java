//410
public class func{
public void addCustomControls(JPanel panel){
    projectChooser = new JComboBox<>();
    panel.add(projectChooser, BorderLayout.CENTER);
    projectChooser.addItemListener(this);
}
}
