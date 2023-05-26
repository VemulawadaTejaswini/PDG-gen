public class func{
public void createLabel(JPanel pPanel,int xOff,int yOff){
    label.setFont(new Font("Dialog", Font.BOLD, 10));
    label.setBounds(xOff, yOff, LABEL_WIDTH, LABEL_HEIGHT);
    pPanel.add(label);
}
}
