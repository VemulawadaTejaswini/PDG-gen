//28
public class func{
	public void createTable(){
        for (int i = 0; i < PROCEDURES.length; i++) {
            stmt.execute(PROCEDURES[i]);
        }
        stmt.close();
}
}
