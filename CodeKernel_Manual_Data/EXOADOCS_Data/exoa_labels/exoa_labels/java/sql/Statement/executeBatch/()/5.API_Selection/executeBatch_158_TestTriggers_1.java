public class A{
	public void testTriggers() throws SQLException{
		int insertValues[] = { 1, 2, 3, 4 };
		int updateValues[][] = {{1, 3}, {5, 6}};
		
		
		Statement stmt = m_DBConnection.createStatement();
		
		stmt.addBatch("create table testTriggerTable_0 (a integer)");
		stmt.addBatch("create table testTriggerTable_1 (old_a integer, new_a integer)");
		stmt.executeBatch();
		
		
		stmt.executeUpdate("create trigger "+TRIGGER_PREFIX+"_1 "+	"after update of a on testTriggerTable_0 "+"DECLARE x integer; "+"BEGIN "+	"select a into x from testTriggerTable_0 where a=new.a; "+	"insert into testTriggerTable_1 values(old.a,x); "+"END "+TRIGGER_PREFIX+"_0");

		for(int i=0; i < insertValues.length; ++i){
			stmt.executeUpdate("insert into testTriggerTable_0 values("+insertValues[i]+")");
		}
		
		for(int i=0; i < updateValues[0].length; ++i){
			stmt.executeUpdate("UPDATE testTriggerTable_0 SET a="+updateValues[1][i]+"WHERE a="+updateValues[0][i]);
		}
		
		ResultSet r = stmt.executeQuery("select old_a, new_a from testTriggerTable_1");
		int count=0;
		while(r.next()){
			assertEquals(updateValues[0][count], r.getInt(1));
			assertEquals(updateValues[1][count], r.getInt(2));
			count++;
		}
		
		System.out.println("KK: count="+count+"  updateValues[0].length="+updateValues[0].length);
		assertEquals(count, updateValues[0].length);
		
		stmt.executeUpdate("drop trigger "+TRIGGER_PREFIX+"_1");
		
		r = stmt.executeQuery("select rule_name from iirules where rule_name='"+TRIGGER_PREFIX+"_1'");
		if(r.next()){
			assertFalse(true);
		}
		else{
			assertTrue(true);
		}
		
		r = stmt.executeQuery("select procedure_name from iiprocedures where procedure_name='"+TRIGGER_PREFIX+"_1_proc'");
		if(r.next()){
			assertFalse(true);
		}
		else{
			assertTrue(true);
		}
		
		stmt.addBatch("drop table testTriggerTable_0");
		stmt.addBatch("drop table testTriggerTable_1");
		
		stmt.executeBatch();
		
		stmt.close();
	}
}