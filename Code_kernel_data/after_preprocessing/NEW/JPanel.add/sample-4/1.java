//1
public class func{
public void createPreviewButtonsPanel(){
    final PreviewAction previewAction = new PreviewAction();
    dialogModel.addPropertyChangeListener( previewAction );
    previewButtonsPanel.add( new JButton( previewAction ) );
}
}
