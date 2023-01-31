//546
public class func{
	public void deleteDerby(){
                DriverManager.getConnection("jdbc:derby:" +
                        getBaseDir() + "/derby/test;shutdown=true", "sa", "sa");
}
}
