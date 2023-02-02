//131
public class func{
public void getQuoteForUpdate(Connection conn,String symbol){
        PreparedStatement stmt = getStatement(conn, getQuoteForUpdateSQL);
        stmt.setString(1, symbol); // symbol
        ResultSet rs = stmt.executeQuery();
        if (!rs.next())
            Log.error("TradeJdbc:getQuote -- failure no result.next()");

        else
            quoteData = getQuoteDataFromResultSet(rs);
        stmt.close();
}
}
