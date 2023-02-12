public class func{
public void createErrorPanel(String pluginClass,Exception exc){
    panel.add(new JLabel("<html><font color=#ff0000>Failed to load plugin: " + exc.getMessage() + " (" + exc.getClass().getSimpleName() + ")</font></html>"), new GridBagConstraints(0,0,1,1,1,0,GridBagConstraints.FIRST_LINE_START, GridBagConstraints.HORIZONTAL, new Insets(0,10,0,0), 0, 0));
}
}
