//168
public class func{
public void addTable(JPanel cp,JComponent tablePan,int rowHeight,int rowNum,int columns){
    UiUtil.gbcSet(gbc_, 0, rowNum, columns, rowHeight, UiUtil.BO, 0, 0, 5, 5, 5, 5, UiUtil.CEN, 1.0, 1.0);
    cp.add(tablePan, gbc_);
}
}
