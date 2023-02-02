//242
public class func{
public void expectException(PreparedStatement ps,Object obj1,Object obj2,String expectedSQLState,String label){
      ps.setObject(2, obj2);
      rs = ps.executeQuery();
      rs.next();
}
}
