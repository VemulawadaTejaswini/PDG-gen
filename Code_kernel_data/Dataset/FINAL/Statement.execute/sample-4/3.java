public class func{
public void testSetSRID(){
        Statement st = connection.createStatement();
        st.execute("insert into testSrid values (ST_GeomFromText('POINT( 15 25 )',27572))");
        ResultSet rs = st.executeQuery("SELECT ST_SRID(ST_SETSRID(the_geom,5321)) trans,ST_SRID(the_geom) original  FROM testSrid");
        assertTrue(rs.next());
        assertEquals(27572, rs.getInt("original"));
        assertEquals(5321, rs.getInt("trans"));
}
}
