public class func{
public void after(){
    TestUtil.dropTable(con, "testerr");
    Statement stmt = con.createStatement();
    stmt.execute("DROP DOMAIN testdom");
    stmt.close();
}
}
