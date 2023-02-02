//45
public class func{
public void test5UpdateAfterTriggerNoReferencingClause(){
        basicSetup();
        Statement s = createStatement();
    s.execute("create trigger trigger1 AFTER UPDATE of status on table1 " +
        "update table2 set updates = updates + 1 where table2.id = 1");
}
}
