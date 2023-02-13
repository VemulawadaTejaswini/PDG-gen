public class func{
public void handleExternalLocationChanged(){
    final String text= fExternalLocationControl.getText();
    if (text != null && !"".equals(text))
      fScriptLocation= new File(text).toURI();
    else
      fScriptLocation= null;
}
}
