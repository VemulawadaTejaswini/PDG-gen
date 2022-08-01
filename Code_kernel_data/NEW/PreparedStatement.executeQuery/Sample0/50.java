//49
public class func{
	public void getOrderFrequencyIdForConceptId(Connection connection,Integer conceptIdForFrequency){
    PreparedStatement orderFrequencyIdQuery = connection
            .prepareStatement("select order_frequency_id from order_frequency where concept_id = ?");
    orderFrequencyIdQuery.setInt(1, conceptIdForFrequency);
    ResultSet orderFrequencyIdResultSet = orderFrequencyIdQuery.executeQuery();
    if (!orderFrequencyIdResultSet.next()) {
      return null;
    }
    return orderFrequencyIdResultSet.getInt("order_frequency_id");
}
}
