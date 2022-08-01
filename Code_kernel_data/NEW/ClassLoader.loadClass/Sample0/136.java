//135
public class func{
	public void doLazyInit(){
            createXML = classLoader.loadClass(XML_TYPE_CLASS_NAME).getMethod("createXML", Connection.class,
                    String.class);
}
}
