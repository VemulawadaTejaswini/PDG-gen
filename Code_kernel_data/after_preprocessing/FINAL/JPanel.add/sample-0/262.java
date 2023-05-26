public class func{
public void createCustomComponent(Presentation presentation){
    myButton = (JButton)super.createCustomComponent(presentation).getComponent(0);
    panel.add(myButton, BorderLayout.CENTER);
}
}
