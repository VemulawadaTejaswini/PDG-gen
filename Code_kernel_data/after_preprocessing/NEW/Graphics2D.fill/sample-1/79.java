//79
public class func{
public void drawTab(Graphics g,int left,int right,boolean leftNotch,boolean rightNotch){
    g2.fill(Toolkit.createRoundRect(left, TAB_TOP,
                                    right, TAB_BOTTOM,
                                    leftNotch ? CURVE_RADIUS : 0,
                                    rightNotch ? CURVE_RADIUS : 0,
                                    0, 0));
}
}
