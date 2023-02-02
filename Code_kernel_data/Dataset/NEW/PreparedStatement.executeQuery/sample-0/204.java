//204
public class func{
public void exists(Postgres9Connection pcon,String id){
        Connection con = pcon.getConnection();
            ps = con.prepareStatement("SELECT 1 FROM " + tableName + " WHERE id = ?");
            ps.setObject(1, id, Types.OTHER);
            rs = ps.executeQuery();
            return rs.next();
}
}
