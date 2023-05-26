//10
public class func{
public void buildControlPanel(){
        JTextField nameTextField = new JTextField();
        controlPanel.add(nameTextField, BorderLayout.CENTER);
        controlPanel.add(this.buildRenameButton(nameTextField), BorderLayout.EAST);
}
}
