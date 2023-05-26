//5
public class func{
public void should_close_statement_and_resultset(){
      PreparedStatement statement = connection.prepareStatement(selectDual());
      ResultSet rs = statement.executeQuery();
      DatabaseUtils.closeQuietly(statement);
      assertThat(isClosed(statement)).isTrue();
}
}
