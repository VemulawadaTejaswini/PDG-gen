//32
public class func{
	public void adminCreatePartition(){
    Connection connection = context.createConnection(ADMIN1);
    Statement statement = context.createStatement(connection);
    statement.execute("ALTER TABLE tb1 ADD IF NOT EXISTS PARTITION (b = '1') ");
    statement.close();
}
}
