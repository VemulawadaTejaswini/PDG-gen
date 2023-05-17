//113
public class func{
public void paint(Graphics2D graphics,limelight.ui.model.text.TextModel model){
    if(!model.isCaretOn() || model.hasSelection())
      return;
    Box caret = model.getCaretShape();
    graphics.setColor(model.getContainer().getStyle().getCompiledTextColor().getColor());
    graphics.fill(caret);
}
}
