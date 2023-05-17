//6
public class func{
public void getLobStream(Connection conn,String column,int id){
        PreparedStatement prep = conn.prepareStatement("SELECT " + column +
                " FROM SYSTEM_LOB_STREAM WHERE ID=? ORDER BY PART");
        prep.setInt(1, id);
        return prep.executeQuery();
}
}
