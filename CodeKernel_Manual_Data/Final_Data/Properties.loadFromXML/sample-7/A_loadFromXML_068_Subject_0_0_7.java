public class A{
	//...
	public static void main(){
		InputStream fis = (new URL(_resourceDirectory + "subjects.xml")).openStream();
		SUBJECTS_PROPERTIES = new Properties();
		SUBJECTS_PROPERTIES.loadFromXML(fis);
	}
}