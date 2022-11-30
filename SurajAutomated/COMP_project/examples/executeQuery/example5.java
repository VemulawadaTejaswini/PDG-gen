//1
public class func{
	public void testSetMaxRowsValues(){
        PreparedStatement ps = prepareStatement("values 0,1,2,3,4,5,6,7,8,9",
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ps.setMaxRows(10);
        JDBC.assertDrainResults(ps.executeQuery(), 10);
        ps.setMaxRows(2);
        JDBC.assertDrainResults(ps.executeQuery(), 2);
}
}
