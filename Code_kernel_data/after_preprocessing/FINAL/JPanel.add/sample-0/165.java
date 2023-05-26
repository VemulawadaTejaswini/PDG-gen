public class func{
public void buildAndInstallCenteredButtonBox(JPanel cp,int rowNum,int colWidth,boolean doApply,boolean showAsCancel){
    UiUtil.gbcSet(gbc_, 0, rowNum, colWidth, 1, UiUtil.HOR, 0, 0, 5, 5, 5, 5, UiUtil.SE, 1.0, 0.0);
    cp.add(bBox, gbc_);
}
}
