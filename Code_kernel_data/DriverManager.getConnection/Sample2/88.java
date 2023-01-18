//87
public class func{
	public void testArrayConcatFunctionIntToCharArray(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(varchars,ARRAY[23,45]) FROM regions WHERE region_name = 'SF Bay Area'");
}
}
