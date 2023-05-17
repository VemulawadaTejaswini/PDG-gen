public class func{
public void createCenterPanel(){
    myBrowser = new JEditorPane(UIUtil.HTML_MIME, "");
    panel.add(ScrollPaneFactory.createScrollPane(myBrowser));
}
}
