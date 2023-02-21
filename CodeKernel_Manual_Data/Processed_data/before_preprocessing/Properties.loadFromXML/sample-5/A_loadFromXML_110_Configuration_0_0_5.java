public class A{
	//...
	public static void main(){
		final Properties props = new Properties();
		//...
		final InputStream configFileStream = getResourceFile(configFileKey).toURI().toURL().openStream();
		props.loadFromXML(configFileStream);
	}
}