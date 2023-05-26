public class func{
public void test5InsertAfterTriggerNoReferencingClause(){
        basicSetup();
        Statement s = createStatement();
    s.execute("create trigger trigger1 AFTER INSERT on table1 " +
      "insert into table2(id, updates) values (100, -1)");
}
}
