//71
public class func{
	public void POSTGRESCollector(String oriDBUrl,String username,String password){
            Connection conn = DriverManager.getConnection(oriDBUrl, username, password);
            Catalog.setSeparator(conn);
            Statement s = conn.createStatement();
            ResultSet out = s.executeQuery("SHOW ALL;");
            while(out.next()) {
                dbConf.put(out.getString("name"), out.getString("setting"));
            }
}
}
