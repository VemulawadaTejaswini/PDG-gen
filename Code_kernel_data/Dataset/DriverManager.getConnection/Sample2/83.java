//82
public class func{
	public void MYSQLCollector(String oriDBUrl,String username,String password){
        String dbUrl = oriDBUrl.substring(0, oriDBUrl.lastIndexOf('/'));
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            Catalog.setSeparator(conn);
            Statement s = conn.createStatement();
            ResultSet out = s.executeQuery("SELECT * FROM GLOBAL_VARIABLES;");
            while(out.next()) {
                dbConf.put(out.getString("VARIABLE_NAME"), out.getString("VARIABLE_VALUE"));
            }
}
}
