public class func{
public void createUI(JPanel panel){
        JPropertyPanel props = new JPropertyPanel(this);
        panel.add(props, BorderLayout.CENTER);
        props.init();
}
}
