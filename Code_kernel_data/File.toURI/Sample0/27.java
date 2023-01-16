//26
public class func{
	public void openFileDialog(){
    FileDialog fileDialog = new FileDialog(owner.getShell(),  SWT.OPEN);
    String file = fileDialog.open();
    if (file!=null) {
      return new File(file).toURI();
    }
}
}
