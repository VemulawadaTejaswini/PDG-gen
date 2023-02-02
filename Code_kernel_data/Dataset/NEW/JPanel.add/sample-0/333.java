//333
public class func{
public void getTableCellRendererComponent(JTable table,Object value,boolean isSelected,final boolean hasFocus,int row,int column){
        new BooleanTableCellRenderer().getTableCellRendererComponent(table, ((Pair)value).getSecond(), isSelected, hasFocus, row, column);
      panel.add(component1);
}
}
