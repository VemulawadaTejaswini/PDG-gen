//48
public class func{
	public void performPostOpenStatements(Connection connection){
        Statement stmt = connection.createStatement();
            stmt.execute("SET TRANSACTION ISOLATION LEVEL READ COMMITTED");
            stmt.close();
}
}
