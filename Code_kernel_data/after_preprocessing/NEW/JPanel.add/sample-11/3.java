//3
public class func{
public void wrapComponentInPanel(Component c){
        JPanel wrapperPanel = new JPanel(new GridLayout(1, 1));
        wrapperPanel.setOpaque(false);
        wrapperPanel.add(c);
}
}
