//53
public class func{
public void createPreviewButtonsPanel(){
    previewButtonsPanel.add(new JCheckBox(new LimitRowsCheckBoxActionListener(maxPreviewRowsSpinner)));
    previewButtonsPanel.add(maxPreviewRowsSpinner);
}
}
