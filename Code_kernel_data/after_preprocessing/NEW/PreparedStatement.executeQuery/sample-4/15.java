//15
public class func{
public void query(Connection conn,String sql){
        Mediator.getLogger(Sql.class.getName()).log(Level.FINE, "SQL Query:\n{0}", sql);
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
}
}
