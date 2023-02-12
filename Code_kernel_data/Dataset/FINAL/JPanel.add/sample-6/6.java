public class func{
public void constructFieldWithBrowseButton(final JComponent aComponent,final ActionListener aActionListener,int delta){
    result.add(browseButton, new GridBagConstraints(1, 0, 1, 1, 0, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0,0,0,0), 0,0));
    browseButton.addActionListener(aActionListener);
}
}
