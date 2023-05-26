//1
public class func{
public void decorateSQL(Statement s){
                    for (int i = 0; i < TABLES.length; i++) {
                          s.execute(TABLES[i]);
                    }
}
}
