//41
public class func{
public void insertThreePoints(){
      Statement st = cx.createStatement();
        st.execute("INSERT INTO spatial (geom) VALUES (ST_GeomFromText('POINT(2 2)', 4326))");
        st.close();
}
}
