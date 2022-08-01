//3
public class func{
	public void test(){
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                int size = result.getMetaData().getColumnCount();
}
}
