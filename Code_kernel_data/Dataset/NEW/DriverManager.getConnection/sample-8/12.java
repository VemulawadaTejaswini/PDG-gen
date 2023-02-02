//12
public class func{
public void destroyBundle(UUID id,String where){
        Connection conn = DriverManager.getConnection("jdbc:derby:" + TEST_DIR
                + "/" + where + "/db");
        String table = where.equals("version") ? "VERSION_BUNDLE" : "DEFAULT_BUNDLE";
        PreparedStatement prep = conn.prepareStatement("delete from " + table
                + " where NODE_ID_HI=? and NODE_ID_LO=?");
}
}
