//73
public class func{
	public void executeStatement(PreparedStatement statement){
                        for (String parameter : parameters) {
                            statement.setString(index++, parameter);
                        }
                        ResultSet columns = statement.executeQuery();
                        while (columns.next()) {
                            Table table = addTable(inspectionResults, columns.getString("TABLE_SCHEMA"), null,
                                    columns.getString("TABLE_NAME"));
                            Column column = table.addColumn(columns.getString("COLUMN_NAME"));
                            column.setJdbcType(getJdbcType(column.getJdbcType(), columns.getString("COLUMN_TYPE")));
                        }
}
}
