public class A{
	public static void main(){
		InputStream stream = xmlResourceBundle.getClass().getResourceAsStream( getFileName(xmlResourceBundle) );
		Properties properties = new Properties();
		properties.loadFromXML( stream );
	}
}