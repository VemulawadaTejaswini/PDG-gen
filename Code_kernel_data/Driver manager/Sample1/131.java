//130
public class func{
	public void openConnection(){
        Connection conn = DriverManager.getConnection(URL, "sa", "sa");
        Statement stat = conn.createStatement();
            stat.execute("CREATE INDEX IDX_TEST_D ON TEST(D)");
}
}
