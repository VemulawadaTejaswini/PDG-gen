//14
public class func{
	public void decorateSQL(Statement s){
                for (int i = 0; i < ROUTINES.length; i++) {
                    s.execute(ROUTINES[i]);
                }
                for (int i = 0; i < TABLES.length; i++) {
                    s.execute(TABLES[i][1]);
                }
}
}
