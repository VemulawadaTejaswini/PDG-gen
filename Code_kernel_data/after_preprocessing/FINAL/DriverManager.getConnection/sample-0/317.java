public class func{
public void getConnection(){
    conn = DriverManager.getConnection("jdbc:derby:"+DB_NAME+";create=true",SCHEMA_NAME, this.getDbkey());
}
}
