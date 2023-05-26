//6
public class func{
public void getSymbolMapUrl(){
    File symbolMapsDirectory = new File("war/" + getJunitSymbolMapsPath());
      return symbolMapsDirectory.exists() ? symbolMapsDirectory.toURI().toURL()
          : getServletContext().getResource(getJunitSymbolMapsPath());
}
}
