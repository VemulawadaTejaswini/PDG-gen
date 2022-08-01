//27
public class func{
	public void widgetSelected(SelectionEvent e){
        FileDialog dialog = new FileDialog(parent.getShell());
        String file = dialog.open();
        if (file != null)
        {
          text.setText(new File(file).toURI().toString());
        }
}
}
