public class func{
public void createItem(GrepProcessor processor,final OpenConsoleSettingsActionMouseInputAdapter mouseInputAdapter){
    colorPanel.addMouseListener(mouseInputAdapter);
    label.addMouseListener(mouseInputAdapter);
    panel.add(label);
}
}
