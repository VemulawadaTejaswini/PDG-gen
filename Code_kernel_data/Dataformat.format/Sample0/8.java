//7
public class func{
	public void promptForFile(){
        final String fileName = "GoogleEarth-" + df.format(new Date()) + ".kmz";
        fc.setSelectedFile(new File(fileName));
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            return fc.getSelectedFile().getAbsolutePath();
        } else {
            return null;
        }
}
}
