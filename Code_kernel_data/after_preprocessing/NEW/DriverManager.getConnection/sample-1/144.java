//144
public class func{
public void testBasicUpsertSelect(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_TENANT_SPECIFIC_URL);
            conn.setAutoCommit(false);
            conn.createStatement().executeUpdate("upsert into " + TENANT_TABLE_NAME + " (id, tenant_col) values (1, 'Cheap Sunglasses')");
            conn.createStatement().executeUpdate("upsert into " + TENANT_TABLE_NAME + " (id, tenant_col) values (2, 'Viva Las Vegas')");
}
}
