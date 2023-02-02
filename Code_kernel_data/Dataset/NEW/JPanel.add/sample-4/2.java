//2
public class func{
public void createPreviewButtonsPanel(){
    final PreviewAction thePreviewAction = new PreviewAction();
    dialogModel.addPropertyChangeListener(thePreviewAction);
    previewButtonsPanel.add(new JButton(thePreviewAction));
}
}
