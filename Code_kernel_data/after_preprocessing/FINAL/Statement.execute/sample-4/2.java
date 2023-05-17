public class func{
public void executeStatement(String statementStr,int resultFlags){
    if (resultFlags == DatabaseConnection.DEFAULT_RESULT_FLAGS) {
      resultFlags = ResultSet.TYPE_FORWARD_ONLY;
    }
    Statement statement = connection.createStatement(resultFlags, ResultSet.CONCUR_READ_ONLY);
    statement.execute(statementStr);
    return statement.getUpdateCount();
}
}
