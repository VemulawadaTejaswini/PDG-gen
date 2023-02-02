//5
public class func{
public void constructFieldWithBrowseButton(final JComponent aComponent,final ActionListener aActionListener,int delta){
    result.add(aComponent, new GridBagConstraints(0, 0, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0,0));
    FixedSizeButton browseButton = new FixedSizeButton(aComponent.getPreferredSize().height - delta);//ignore border in case of browse button
    TextFieldWithBrowseButton.MyDoClickAction.addTo(browseButton, aComponent);
}
}
