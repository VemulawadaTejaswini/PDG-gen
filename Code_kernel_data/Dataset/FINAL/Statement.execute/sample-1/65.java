public class func{
public void execute(ReviewDb db,String sql){
    Statement s = ((JdbcSchema) db).getConnection().createStatement();
      s.execute(sql);
      s.close();
}
}
