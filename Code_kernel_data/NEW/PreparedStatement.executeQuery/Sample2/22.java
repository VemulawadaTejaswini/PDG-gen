//21
public class func{
	public void getAllApplicants(ResultSet[] rs1){
            DriverManager.getConnection("jdbc:default:connection");
            conn.prepareStatement("select * from APPLICANT");
        rs1[0] = ps1.executeQuery();
}
}
