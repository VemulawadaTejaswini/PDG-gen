public class A{
	//...
	public static void main(){
		Properties properties = new Properties();
		//...
		InputStream propertiesInputStream = new FileInputStream(ModelProperties.propertiesFile);
		properties.loadFromXML(propertiesInputStream);
	}
}