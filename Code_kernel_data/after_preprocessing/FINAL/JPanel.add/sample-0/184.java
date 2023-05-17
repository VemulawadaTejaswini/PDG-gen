public class func{
public void createLabeledPanel(String labelText,JComponent component){
    final JBLabel label = new JBLabel(labelText, UIUtil.ComponentStyle.SMALL);
    IJSwingUtilities.adjustComponentsOnMac(label, component);
    panel.add(component);
}
}
