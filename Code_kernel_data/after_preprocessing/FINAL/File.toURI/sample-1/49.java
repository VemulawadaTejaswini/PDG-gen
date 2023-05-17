public class func{
public void getListCellRendererComponent(JList list,Object value,int index,boolean isSelected,boolean cellHasFocus){
            File f = (File) value;
            Project p = FileOwnerQuery.getOwner(f.toURI());
            String message = f.getAbsolutePath();            
}
}
