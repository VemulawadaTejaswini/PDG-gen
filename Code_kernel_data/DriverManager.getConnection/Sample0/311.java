//310
public class func{
	public void openConnection(){
            conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/"+dbName, dbUser, dbPassword );
}
}
