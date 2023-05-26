public class func{
public void addChooseFactoryLabel(JComponent component,boolean top){
    factoryPanel.add(myChooseFactory, top ? BorderLayout.NORTH : BorderLayout.CENTER);
    panel.add(factoryPanel, BorderLayout.WEST);
}
}
