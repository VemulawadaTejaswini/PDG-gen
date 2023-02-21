public class A{
	//...
	public static void main(){
		Properties props = new Properties();
		//...
		InputStream stream = new ReaderInputStream(reader );
		props.loadFromXML(stream);
	}
}