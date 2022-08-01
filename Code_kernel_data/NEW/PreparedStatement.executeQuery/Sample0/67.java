//66
public class func{
	public void call(){
                        int x = (int) (Math.random() * 2);
                        prep.setInt(1, x);
                        ResultSet rs = prep.executeQuery();
                        rs.next();
                        String data = rs.getString(2);
                        if (data.length() != 10000 + x) {
                            throw new Exception(data.length() + " != " + x);
                        }
                        rs.close();
}
}
