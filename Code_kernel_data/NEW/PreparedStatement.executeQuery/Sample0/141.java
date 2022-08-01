//140
public class func{
	public void findLookupId(Connection connection,short activityId){
        PreparedStatement statement = connection.prepareStatement("select activity_name_lookup_id "
                + "from activity where activity_id = ?");
        statement.setShort(1, activityId);
        ResultSet results = statement.executeQuery();
        if (results.next()) {
            short lookupId = results.getShort("activity_name_lookup_id");
            statement.close();
            return lookupId;
        }
        statement.close();
}
}
