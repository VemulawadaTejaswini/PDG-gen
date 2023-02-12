public class func{
public void test5InsertBeforeTriggerNoReferencingClause(){
        basicSetup();
        Statement s = createStatement();
    s.execute("create trigger trigger1 NO CASCADE BEFORE INSERT on table1 " +
      "select updates from table2 where table2.id = 1");
}
}
