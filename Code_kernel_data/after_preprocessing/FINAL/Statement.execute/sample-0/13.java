public class func{
public void decorateSQL(Statement s){
                for (int i = 0; i < PROCEDURES.length; i++) {
                    s.execute(PROCEDURES[i]);
                }
                for (int i = 0; i < TABLES.length; i++) {
                    s.execute(TABLES[i][1]);
                }
}
}
