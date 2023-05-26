//106
public class func{
public void setIdent(String title,PersonIdent ident){
        String dateString = dateFormat.format(ident.getWhen());
        whenView.setText(dateString);
}
}
