public class func{
public void testZConstraintOk(){
        Statement st = connection.createStatement();
        st.execute("drop table LIDAR_PTS IF EXISTS");
}
}
