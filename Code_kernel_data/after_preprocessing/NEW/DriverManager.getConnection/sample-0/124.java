//124
public class func{
public void assertViewType(String[] views,ViewType viewType){
        PhoenixConnection conn = DriverManager.getConnection(getUrl(), props).unwrap(PhoenixConnection.class);
        conn.createStatement().execute(ct);
}
}
