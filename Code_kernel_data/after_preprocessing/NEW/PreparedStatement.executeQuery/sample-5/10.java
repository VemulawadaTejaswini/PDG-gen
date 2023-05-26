//10
public class func{
public void getVectorClockByDatabaseVersionId(int databaseVersionId){
    PreparedStatement preparedStatement = getStatement("databaseversion.select.all.getVectorClockByDatabaseVersionId.sql");
    preparedStatement.setInt(1, databaseVersionId);
    ResultSet resultSet = preparedStatement.executeQuery();
}
}
