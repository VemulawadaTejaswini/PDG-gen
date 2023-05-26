public class func{
public void createCustomComponent(final Presentation presentation){
    label.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4));
    panel.add(super.createCustomComponent(presentation), BorderLayout.CENTER);
}
}
