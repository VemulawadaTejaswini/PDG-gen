public class func{
public void testDistinctPaddingInVarcharIgnored(){
    Statement s = createStatement();
    s.execute("insert into v values ('hello      ')");
    assertRowCount(1, s.executeQuery("select distinct v from v"));
    JDBC.assertSingleValueResultSet(s.executeQuery("select {fn length(c)} from (select distinct v from v) as t(c)"), "5");
    s.execute("drop table v");
    s.close();
}
}
