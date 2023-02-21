public class A{
	public static void loadSettings(String name) {
		String path = getSettingsFileName(name);
		
		if (settings.get(name) != null) {
			Application.getLog().warning("Settings bundle " + path + " already exists!");
			return;
		}
		
		try {
			Properties setting = new Properties();
			settings.put(name, setting);
			
			InputStream is = new FileInputStream(path);
			setting.loadFromXML(is);
		} catch (Exception e) {
			Application.getLog().severe("Unable to load " + path + " (" + e.getLocalizedMessage()+ "). Settings won't be remembered.");
		}
	}
}