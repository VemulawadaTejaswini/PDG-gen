public class func{
public void fire(Connection conn,ResultSet oldTemplate,ResultSet newTemplate){
        smt.setString(1, newTemplate.getString("template_id"));
        ResultSet rs=smt.executeQuery();
        boolean found=rs.next();
        rs.close(); smt.close();
}
}
