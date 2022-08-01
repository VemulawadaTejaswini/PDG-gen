//63
public class func{
	public void reportLeasOwnerShipAndDuration(Connection connection){
            statement = connection.prepareStatement(getStatements().getLeaseOwnerStatement());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                LOG.info(getLeaseHolderId() + " Lease held by " + resultSet.getString(1) + " till " + new Date(resultSet.getLong(2)));
            }
            close(statement);
}
}
