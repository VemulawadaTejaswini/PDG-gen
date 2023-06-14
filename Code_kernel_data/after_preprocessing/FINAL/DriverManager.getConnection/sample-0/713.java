public class func{
public void getHiveConnection(){
        return DriverManager.getConnection("jdbc:hive2:///", "", "");
}
}
