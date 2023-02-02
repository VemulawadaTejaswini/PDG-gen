//81
public class func{
public void testArrayConcatFunctionWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        PreparedStatement st = conn.prepareStatement("SELECT ARRAY_CAT(?,?) FROM regions WHERE region_name = 'SF Bay Area'");
        Array array1 = conn.createArrayOf("VARCHAR", new Object[]{"a", "b", "c", null});
        st.setArray(1, array1);
        Array array2 = conn.createArrayOf("VARCHAR", new Object[]{"a", "b", "c"});
        st.setArray(2, array2);
        rs = st.executeQuery();
        assertTrue(rs.next());
        Array expected = conn.createArrayOf("VARCHAR", new Object[]{"a", "b", "c", null, "a", "b", "c"});
}
}
