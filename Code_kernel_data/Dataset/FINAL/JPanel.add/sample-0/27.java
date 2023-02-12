public class func{
public void initInputBar(AppD app,boolean showInputTop,JPanel northPanel,JPanel southPanel){
      northPanel.add(gui.getAlgebraInput(), BorderLayout.SOUTH);
      southPanel.add(gui.getAlgebraInput(), BorderLayout.SOUTH);
    ((AlgebraInput) gui.getAlgebraInput()).updateOrientation(showInputTop);
}
}
