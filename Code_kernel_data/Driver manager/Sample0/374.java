//373
public class func{
	public void getConnection(){
        String url = "jdbc:h2:" + getBaseDir() + "/halt";
        return DriverManager.getConnection(url, "sa", "sa");
}
}
