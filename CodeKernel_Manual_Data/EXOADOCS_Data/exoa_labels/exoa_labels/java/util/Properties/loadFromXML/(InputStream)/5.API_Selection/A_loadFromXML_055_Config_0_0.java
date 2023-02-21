public class A{
	//...
	public static void main(){
		InputStream input=new FileInputStream(new File(xmlInputFile));
		super.loadFromXML(input);
	}
}