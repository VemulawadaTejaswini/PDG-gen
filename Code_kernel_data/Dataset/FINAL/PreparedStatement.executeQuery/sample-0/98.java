public class func{
public void findLookupId(Connection connection){
        PreparedStatement statement = connection.prepareStatement("select LOOKUP_ID "
                + "from financial_action where fin_action_id = ?");
        statement.setInt(1, action);
        ResultSet results = statement.executeQuery();
        if (results.next()) {
            short lookupId = results.getShort("lookup_id");
            statement.close();
            return lookupId;
        } else {
            statement.close();
            throw new RuntimeException("unable to downgrade: no activity with id " + action);
        }
}
}
