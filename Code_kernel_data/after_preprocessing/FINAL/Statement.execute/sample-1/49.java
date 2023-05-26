public class func{
public void setUp(){
    connDDL = openDefaultConnection();
    Statement s = connDDL.createStatement();
    s.execute(
    "CREATE TABLE PED001 (A INT NOT NULL, B DECIMAL(6,4), C VARCHAR(20))");
    s.close();
}
}
