public class func{
public void getAccountProfileData(Connection conn,Integer accountID){
        stmt.setInt(1, accountID.intValue());
        ResultSet rs = stmt.executeQuery();
        AccountProfileDataBean accountProfileData = getAccountProfileDataFromResultSet(rs);
        stmt.close();
}
}
