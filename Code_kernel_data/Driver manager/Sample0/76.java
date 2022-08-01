//75
public class func{
	public void SqliteHelper(File f){
    connection = DriverManager.getConnection("jdbc:sqlite:" + f.getAbsolutePath());
    statement = connection.createStatement();
    statement.setQueryTimeout(30);
}
}
