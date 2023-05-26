//17
public class func{
public void addXToCharlie(){
            DriverManager.getConnection("jdbc:default:connection");
            conn
                .prepareStatement("update APPLICANT set name = 'Charliex' " 
                    + "where name = 'Charlie'");
        ps1.executeUpdate();
}
}
