//121
public class func{
	public void addMe(int p1){
            DriverManager.getConnection("jdbc:default:connection");
        Statement s = conn.createStatement();
        s.executeQuery("select * from t11_AutoGen");
        s.close();
}
}
