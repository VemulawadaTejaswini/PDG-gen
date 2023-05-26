//79
public class func{
public void traceMarker(){
                    connection.prepareStatement("select * from employee where name like ?");
                preparedStatement.setString(1, "john%");
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    rs.getString(1);
                }
                preparedStatement.close();
}
}
