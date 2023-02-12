public class func{
public void determineTimeDifference(Connection connection){
        PreparedStatement statement = connection.prepareStatement(getStatements().getCurrentDateTime());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Timestamp timestamp = resultSet.getTimestamp(1);
            long diff = System.currentTimeMillis() - timestamp.getTime();
            if (Math.abs(diff) > maxAllowableDiffFromDBTime) {
                result = (-diff);
            }
            LOG.info(getLeaseHolderId() + " diff adjust from db: " + result + ", db time: " + timestamp);
        }
}
}
