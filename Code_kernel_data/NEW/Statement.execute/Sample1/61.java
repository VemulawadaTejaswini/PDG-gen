//60
public class func{
	public void setUp(){
        stmt.execute("ALTER TABLE testerr ADD CONSTRAINT testerr_pk PRIMARY KEY (id)");
        stmt.close();
}
}
