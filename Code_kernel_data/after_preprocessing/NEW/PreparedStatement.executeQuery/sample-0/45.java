//45
public class func{
public void getGlobalProperty(Connection connection,String gp){
    PreparedStatement select = connection
            .prepareStatement("select property_value from global_property where property = ?");
      select.setString(1, gp);
      ResultSet resultSet = select.executeQuery();
      if (resultSet.next()) {
        return resultSet.getString(1);
      } else {
        throw new IllegalArgumentException("Global property not found " + gp);
      }
}
}
