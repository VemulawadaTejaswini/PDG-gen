public class func{
public void paintContourBackground(Graphics g,Component comp,int width,int height,Shape contour,boolean isFocused,SubstanceColorScheme fillScheme,boolean hasShine){
    for (int i = 0; i < this.fractions.length; i++) {
      ColorSchemeSingleColorQuery colorQuery = this.colorQueries[i];
      fillColors[i] = colorQuery.query(fillScheme);
    }
    MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0,
        height, this.fractions, fillColors, CycleMethod.REPEAT);
    graphics.setPaint(gradient);
    graphics.fill(contour);
    graphics.dispose();
}
}
