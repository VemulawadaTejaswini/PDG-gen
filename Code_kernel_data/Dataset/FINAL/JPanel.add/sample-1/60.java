public class func{
public void createPatternListPane(final String labelText,final String[] patterns){
        pane.add(BorderLayout.NORTH, new JLabel(labelText));
        pane.add(BorderLayout.CENTER, scrollableList);
}
}
