//8
public class func{
	public void testDateTimeMappings(){
        final PreparedStatement ps = connection.prepareStatement("SELECT lt, gt, zone from tmp.test_time");
        final ResultSet rs = ps.executeQuery();
}
}
