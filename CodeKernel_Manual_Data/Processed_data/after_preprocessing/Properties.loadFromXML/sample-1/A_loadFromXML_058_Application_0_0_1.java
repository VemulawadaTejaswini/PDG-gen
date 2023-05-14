public class A{
	public static void main(){
		Properties setting = new Properties();
		InputStream is = new FileInputStream(path);
		setting.loadFromXML(is);
	}
}