//151
public class func{
public void BIG_COL_491(int i,ResultSet[] rs1,ResultSet[] rs2){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement st1 = conn.createStatement();
    rs1[0] = st1.executeQuery(
      "select int1, varchar32k from jira491 where int1 < " + i + " order by 1");
}
}
