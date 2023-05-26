public class func{
public void addSuffixToName(String name,String suffix){
            DriverManager.getConnection("jdbc:default:connection");
            conn.prepareStatement("update APPLICANT set name = ? "
                + "where name = ?");
        ps1.setString(2, name);
        ps1.executeUpdate();
}
}
