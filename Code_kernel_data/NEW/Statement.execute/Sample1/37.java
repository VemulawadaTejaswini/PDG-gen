//36
public class func{
	public void adminCreate(String db,String table){
    if (table != null) {
      statement.execute("CREATE table " + db + "." + table + " (a string)");
    }
    statement.close();
}
}
