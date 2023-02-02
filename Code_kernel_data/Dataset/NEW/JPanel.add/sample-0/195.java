//195
public class func{
public void createRadioButton(String text,ButtonGroup group,JPanel radioPanel){
        JRadioButton radioButton = new JRadioButton(text);
        radioButton.setBorder(null);
        group.add(radioButton);
        radioPanel.add(radioButton);
}
}
