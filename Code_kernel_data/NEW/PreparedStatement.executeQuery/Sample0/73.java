//72
public class func{
	public void select(Set<String> atts,PreparedStatement pstmt){
    ResultSet row=pstmt.executeQuery();
    while(row.next())
      {
      String s=this.expression.eval(row);
      if(s==null || s.isEmpty()) continue;
      atts.add(s);
      }
    row.close();
}
}
