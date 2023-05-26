public class func{
public void testMultibatchSelect(){
    Statement s = conn.createStatement();
    assertTrue(s.execute("select * from tables, columns limit 7000"));
    ResultSet rs = s.getResultSet();
    while (rs.next()) {
      i++;
      rs.getString(1);
    }
}
}
