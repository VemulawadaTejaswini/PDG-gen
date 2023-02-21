public class A{
	//...
	public static void main(){
		Properties prop=null;
		//...
		prop.loadFromXML(rs.getBinaryStream(DB_CONFIG));
	}
}