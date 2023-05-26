public class func{
public void openNewFile(){
    fc.setFilterSet(openFs);
    fc.setAccessory(null);
    if (fc.showOpenDialog(LGM.frame) != CustomFileChooser.APPROVE_OPTION) return;
    File f = fc.getSelectedFile();
    if (f == null) return;
    open(f.toURI());
}
}
