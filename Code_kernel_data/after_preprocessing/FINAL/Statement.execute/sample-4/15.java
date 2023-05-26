public class func{
public void tearUp(){
        connection = SpatialH2UT.createSpatialDataBase(DB_NAME);
        Statement st = connection.createStatement();
        st.execute("drop table if exists spatial_ref_sys;");
}
}
