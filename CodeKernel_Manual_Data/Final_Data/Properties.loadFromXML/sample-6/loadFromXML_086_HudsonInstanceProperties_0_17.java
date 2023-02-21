public class A{
	public HudsonInstanceProperties(FileObject properties) {
		try {
			loadFromXML(properties.getInputStream());
		} catch (IOException e) {
			Exceptions.printStackTrace(e);
		}
	}
}