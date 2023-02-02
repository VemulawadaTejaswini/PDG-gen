//47
public class func{
public void getCustomersCount(){
        stmt.setInt(1, partner.getId());
        ResultSet result = stmt.executeQuery();
        if (result.next()) {
            retValue = result.getInt(1);
        }
        result.close();
}
}
