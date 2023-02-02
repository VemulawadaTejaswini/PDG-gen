//0
public class func{
public void signersTests(Connection conn){
        PreparedStatement ps = conn.prepareStatement("VALUES EMC.GETSIGNERS(?)");
        ps.setString(1, "org.apache.derbyTesting.databaseclassloader.emc");    
        JDBC.assertSingleValueResultSet(ps.executeQuery(),
                "CN=EMC CTO, OU=EMC APP, O=Easy Mail Company, C=US");
        ps.setString(1, "org.apache.derbyTesting.databaseclassloader.addon.vendor.util");
        JDBC.assertSingleValueResultSet(ps.executeQuery(), null);
        ps.close();
}
}
