//126
public class func{
public void testGetSRID(){
        Statement st = cx.createStatement();
        st.execute("CALL CreateSpatialIndex(null, 'SPATIAL', 'GEOM', '4326')");
}
}
