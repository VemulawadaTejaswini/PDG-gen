//76
public class func{
public void testNoBegin(){
        Connection connection = ConnectionHelper.getConnection(null);
            Statement st = connection.createStatement();
            String sql = getValidationQuery(connection);
            st.execute(sql);
}
}
