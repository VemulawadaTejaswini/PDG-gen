//21
public class func{
	public void test5DeleteAfterTriggerNoReferencingClause(){
        basicSetup();
        Statement s = createStatement();
    s.execute("create trigger trigger1 AFTER DELETE on table1 " +
        "delete from table2 where id=1");
}
}
