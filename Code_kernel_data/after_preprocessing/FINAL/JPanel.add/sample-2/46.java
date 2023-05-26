public class func{
public void wrapInEmptyPanel(JComponent component,Border border){
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(component, BorderLayout.CENTER);
        panel.setBorder(border);
}
}
