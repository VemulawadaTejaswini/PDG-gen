//129
public class func{
	public void setUpClass(){
        Connections.initH2();
        Statement stmt = Connections.getStatement();
        stmt.execute("create table if not exists " +
                "newschema.SURVEY(ID2 int auto_increment, NAME2 varchar(30), NAME3 varchar(30))");
}
}
