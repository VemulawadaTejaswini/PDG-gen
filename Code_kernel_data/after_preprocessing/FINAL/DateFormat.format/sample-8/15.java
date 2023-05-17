public class func{
public void getTableCellRendererComponent(final JTable list,final Object value,final boolean isSelected,final boolean cellHasFocus,final int index,final int col){
            final Date date = (Date)value;
            if (date != null) {
                setText(formatter.format(date));
            } else {
                setText("");
            }
}
}
