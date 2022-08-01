//52
public class func{
	public void testArrayConcatFunctionChar2(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(chars,ARRAY['facfacfacfacfacfacfac','facfacfacfacfacfacfac']) FROM regions WHERE region_name = 'SF Bay Area'");
        rs.next();
        rs.getArray(1);
}
}
