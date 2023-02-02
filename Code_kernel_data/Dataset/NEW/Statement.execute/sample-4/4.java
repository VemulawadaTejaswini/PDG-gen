//4
public class func{
public void test_ST_AccumCollection(){
        Statement st = connection.createStatement();
        st.execute("DROP TABLE IF EXISTS TESTACCUMCOLLECT;" +
                "CREATE TABLE TESTACCUMCOLLECT AS SELECT 'MULTIPOLYGON (((50 31, 54 31, 54 29, 50 29, 50 31))," +
                " ((66 34, 62 34, 62 32, 66 32, 66 34)))'::geometry the_geom");
        ResultSet rs = st.executeQuery("SELECT ST_Accum(the_geom) FROM TESTACCUMCOLLECT");
        assertTrue(rs.next());
        assertEquals("MULTIPOLYGON (((50 31, 54 31, 54 29, 50 29, 50 31)), ((66 34, 62 34, 62 32, 66 32, 66 34)))", rs.getString(1));
        rs.close();
}
}
