public class func{
public void getDBConn(){
        return DriverManager.getConnection(DBURL,USERNAME,PASSWORD);  
}
}
