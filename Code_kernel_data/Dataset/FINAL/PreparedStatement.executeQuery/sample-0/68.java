public class func{
public void executeStatement(PreparedStatement statement){
                            Table table = index.getTable();
                            statement.setString(1, table.getSchema().getName());
                            statement.setString(2, table.getName());
                            statement.setString(3, index.getName());
                            ResultSet expressions = statement.executeQuery();
                            if (expressions.next()) {
                                expression = expressions.getString(1);
                            }
}
}
