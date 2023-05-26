public class func{
public void buildToolBar(){
    JPanel bar = new JPanel();
    bar.add(closeButton);
    return UIUtilities.buildComponentPanelRight(bar);
}
}
