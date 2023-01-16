//4
public class func{
	public void setup(){
        connection = (Connection)((AbstractSession)getSession()).getAccessor().getDatasourceConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT EMP_ID FROM EMPLOYEE");
        ResultSet result = statement.executeQuery();
        int size = result.getMetaData().getColumnCount();
}
}
