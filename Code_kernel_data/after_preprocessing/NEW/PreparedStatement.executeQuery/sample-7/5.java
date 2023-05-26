//5
public class func{
public void parameter2(int a,java.math.BigDecimal b,java.math.BigDecimal c,java.sql.ResultSet[] rs){
        ps.setString(3, c.toString());
        ps.executeUpdate();
        ps.close();
        ps = conn.prepareStatement("select a,b,c from PT1 where a = ?");
        ps.setInt(1, a);
        rs[0] = ps.executeQuery();
}
}
