//196
public class func{
public void setUp(){
        conn = DriverManager.getConnection(getUrl());
        converter = new StringToArrayConverter(conn, ":", PVarchar.INSTANCE);
}
}
