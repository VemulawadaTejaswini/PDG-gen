public class func{
public void getHoldingData(Connection conn,int holdingID){
        PreparedStatement stmt = getStatement(conn, getHoldingSQL);
        stmt.setInt(1, holdingID);
        ResultSet rs = stmt.executeQuery();
        if (!rs.next())
            Log.error("TradeJdbc:getHoldingData -- no results -- holdingID=" + holdingID);
        else
            holdingData = getHoldingDataFromResultSet(rs);
        stmt.close();
}
}
