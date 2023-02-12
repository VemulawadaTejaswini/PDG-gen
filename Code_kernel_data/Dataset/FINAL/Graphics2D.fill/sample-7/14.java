public class func{
public void paint(@NotNull Graphics g,@NotNull JComponent divider){
      Graphics2D gg = DiffDividerDrawUtil.getDividerGraphics(g, divider, getEditor(ThreeSide.BASE).getComponent());
      gg.setColor(DiffDrawUtil.getDividerColor(getEditor(ThreeSide.BASE)));
      gg.fill(gg.getClipBounds());
      Editor editor1 = mySide.select(getEditor(ThreeSide.LEFT), getEditor(ThreeSide.BASE));
      Editor editor2 = mySide.select(getEditor(ThreeSide.BASE), getEditor(ThreeSide.RIGHT));
}
}
