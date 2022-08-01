//22
public class func{
	public void setSchema(String schema){
        Statement stm = createStatement();
        stm.execute("SET SCHEMA " + schema);
        stm.close();
}
}
