public class func{
public void createThemePanel(String title,Component example){
    Insets insets = new Insets( 5, 5, 5, 5 );
    panel.add( new JLabel( title ), new GridBagConstraints( 0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, insets, 0, 0 ));
    panel.add( example, new GridBagConstraints( 0, 1, 1, 1, 1.0, 1000.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0 ));
}
}
