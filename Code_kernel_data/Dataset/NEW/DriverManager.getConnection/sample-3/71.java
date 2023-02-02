//71
public class func{
public void getTwoApplicants(String name1,String name2,ResultSet[] rs1){
            DriverManager.getConnection("jdbc:default:connection");
            conn.prepareStatement("select * from APPLICANT where name = ? "
                + "or name = ?");
        ps1.setString(2, name2);
        rs1[0] = ps1.executeQuery();
}
}
