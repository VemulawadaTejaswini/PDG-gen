//57
public class func{
	public void getConceptUuid(Connection connection,int conceptId){
    PreparedStatement select = connection.prepareStatement("select uuid from concept where concept_id = ?");
      select.setInt(1, conceptId);
      ResultSet resultSet = select.executeQuery();
      if (resultSet.next()) {
        return resultSet.getString(1);
      } else {
        throw new IllegalArgumentException("Concept not found " + conceptId);
      }
}
}
