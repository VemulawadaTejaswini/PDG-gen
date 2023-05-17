public class func{
public void test_ST_Buffer7(){
        Statement st = connection.createStatement();
        st.execute("SELECT ST_Buffer("
                + " ST_GeomFromText('LINESTRING (100 250, 200 250, 150 350)'),"
                + " 10, 'quad_segs=2 endcap=flated');");
}
}
