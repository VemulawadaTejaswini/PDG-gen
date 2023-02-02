//82
public class func{
public void testArrayConcatFunctionWithNulls4(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        PreparedStatement st = conn.prepareStatement("SELECT ARRAY_CAT(?,?) FROM regions WHERE region_name = 'SF Bay Area'");
        Array array1 = conn.createArrayOf("VARCHAR", new Object[]{null, "a", null, "b", "c", null, null});
        st.setArray(1, array1);
        Array array2 = conn.createArrayOf("VARCHAR", new Object[]{null, null, "a", null, "b", null, "c", null});
        st.setArray(2, array2);
        rs = st.executeQuery();
        assertTrue(rs.next());
        Array expected = conn.createArrayOf("VARCHAR", new Object[]{null, "a", null, "b", "c", null, null, null, null, "a", null, "b", null, "c", null});
}
}
