//64
public class func{
	public void createStateGroup(Composite parent,IFileStore fileStore,IFileInfo fileInfo){
    timeStampText.setText(format.format(new Date(fileInfo.getLastModified())));
    timeStampText.setBackground(timeStampText.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
}
}
