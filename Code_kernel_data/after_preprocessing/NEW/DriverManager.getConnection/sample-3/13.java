//13
public class func{
public void main(String[] args){
     Connection c = DriverManager.getConnection("jdbc:hsqldb:file:target/test-classes/hsql/test_dj_db", "sa", "");
     PreparedStatement ps = c.prepareStatement("SELECT * FROM Customer");
     ResultSet rs = ps.executeQuery();
     while (rs.next()) {
       log.info(rs.getString("firstname")+ ", " + rs.getString("lastname"));
    }
    rs.close();
}
}
