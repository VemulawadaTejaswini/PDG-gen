//81
public class func{
	public void noOfNodes(){
        ps.setString(1, getQuery());
        ResultSet results = ps.executeQuery();
        results.next();
        int no = results.getInt(1);
        results.close();
}
}
