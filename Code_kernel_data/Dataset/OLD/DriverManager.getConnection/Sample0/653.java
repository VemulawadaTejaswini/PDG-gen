//652
public class func{
	public void JdbcDAO(final String location,final JPasswordField pfield){
    conn = DriverManager.getConnection(dlp.getConnectionString(),
                                       dlp.getUsername(),
                                       new String(pfield.getPassword()));
}
}
