public class func{
public void testReadOnly(){
        TestUtil.initDriver();
        Connection con = DriverManager.getConnection(TestUtil.getURL() + "&readOnly=true", TestUtil.getUser(), TestUtil.getPassword());
        assertNotNull(con); 
        assertTrue(con.isReadOnly());
        con.close();
        con = DriverManager.getConnection(TestUtil.getURL() + "&readOnly=false", TestUtil.getUser(), TestUtil.getPassword());
        assertNotNull(con); 
        assertFalse(con.isReadOnly());
        con.close();
        con = DriverManager.getConnection(TestUtil.getURL(), TestUtil.getUser(), TestUtil.getPassword());
        assertNotNull(con); 
        assertFalse(con.isReadOnly());
        con.close();
}
}
