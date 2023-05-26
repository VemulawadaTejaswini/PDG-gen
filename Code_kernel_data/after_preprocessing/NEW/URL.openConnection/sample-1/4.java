//4
public class func{
public void test_openConnection_FileProtocal(){
        String basedir = new File("temp.java").getAbsolutePath();
        URLConnection conn = new URL(fileUrlString).openConnection();
        assertEquals("file", conn.getURL().getProtocol());
        assertEquals(new File(basedir), new File(conn.getURL().getFile()));
        conn = new URL(nonLocalUrlString).openConnection();
        assertEquals("ftp", conn.getURL().getProtocol());
        assertEquals(new File(basedir), new File(conn.getURL().getFile()));
}
}
