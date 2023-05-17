public class func{
public void setButtonComponent(@NotNull ActiveComponent component){
    panel.add(component.getComponent(), BorderLayout.CENTER);
    panel.setOpaque(false);
    add(panel, BorderLayout.EAST);
}
}
