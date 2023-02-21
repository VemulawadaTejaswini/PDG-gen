public class A{
	public void run() {
		try {
			InputStream fis = (new URL(_resourceDirectory + "subjects.xml")).openStream();
			SUBJECTS_PROPERTIES = new Properties();
			SUBJECTS_PROPERTIES.loadFromXML(fis);
			fis.close();
			INITIALIZED = true;
		} catch (java.util.InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		try {
			sleep(refreshRate);
		} catch (java.lang.InterruptedException e) {
			e.printStackTrace();
		}
	}
}