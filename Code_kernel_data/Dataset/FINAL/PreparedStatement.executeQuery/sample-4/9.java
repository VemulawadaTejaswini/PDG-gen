public class func{
public void testNoHoldScrollableResults(){
         PreparedStatement ps_c1 = conn.prepareStatement("select * from big b1 left outer join  big b2 on b1.a = b2.a left outer join  big b3 on b2.a = b3.a left outer join big b4 on b3.a = b4.a left outer join (big b5 left outer join (big b6 left outer join (big b7 left outer join big b8 on b7.a = b8.a) on b6.a=b7.a) on b5.a = b6.a) on b4.a = b5.a");
         ResultSet rs = ps_c1.executeQuery();
}
}
