//448
public class func{
public void openConnection(){
            conn = DriverManager.getConnection( "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName, dbUser, dbPassword );
}
}
