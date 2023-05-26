public class func{
public void getTableCellRendererComponent(JTable table,Object value,boolean isSelected,final boolean hasFocus,int row,int column){
      final Component component = super.getTableCellRendererComponent(table, ((Pair)value).getFirst(), isSelected, hasFocus, row, column);
      panel.add(component);
        new BooleanTableCellRenderer().getTableCellRendererComponent(table, ((Pair)value).getSecond(), isSelected, hasFocus, row, column);
}
}
