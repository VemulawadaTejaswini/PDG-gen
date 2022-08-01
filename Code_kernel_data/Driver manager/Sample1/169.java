//168
public class func{
	public void runJdbc(){
    final Connection connection = DriverManager.getConnection(
        "jdbc:calcite:model=core/src/test/resources/mysql-foodmart-lattice-model.json");
    final ResultSet resultSet = connection.createStatement()
        .executeQuery("select * from \"adhoc\".\"m{27, 31}\"");
    System.out.println(CalciteAssert.toString(resultSet));
    connection.close();
}
}
