//26
public class func{
public void main(String[] args){
    properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("META-INF/dbconfig.properties"));
    DBConfig config = new DBConfig(properties);
    DriverManager.registerDriver((Driver)Class.forName(config.getDriverClass()).newInstance());
    Connection connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    DatabaseMetadata metadata = new DatabaseMetadata(connection);
    TableMetadata tableMetadata = metadata.getTableMetadata(null, null, "schema_version");
    for (ColumnMetadata columnMetadata : tableMetadata.getColumns().values()) {
      System.out.println(columnMetadata.getName() + " " + columnMetadata.getTypeName() + " " + columnMetadata.getTypeCode());
    }
}
}
