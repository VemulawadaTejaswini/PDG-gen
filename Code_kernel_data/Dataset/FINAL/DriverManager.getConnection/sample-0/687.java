public class func{
public void setUpConnection(){
    connection = DriverManager.getConnection( "jdbc:drill:zk=local" );
    dbMetadata = connection.getMetaData();
}
}
