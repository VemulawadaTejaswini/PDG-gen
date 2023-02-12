public class func{
public void openConnection(URL url){
    String property = ResourceController.getResourceController().getProperty(propertyName);  
    if (property!=null && property.length()>0) {
      File file = new File(property);
      URL ret = file.toURI().toURL();          
      return ret.openConnection();
    }
}
}
