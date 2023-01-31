//170
public class func{
	public void createSampleDbTable(Statement statement,String db,String table){
    statement.execute("LOAD DATA LOCAL INPATH '" + dataFile.getPath() + "' INTO TABLE " + table);
}
}
