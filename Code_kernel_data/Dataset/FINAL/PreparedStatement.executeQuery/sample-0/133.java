public class func{
public void getQuote(Connection conn,String symbol){
        PreparedStatement stmt = getStatement(conn, getQuoteSQL);
        stmt.setString(1, symbol); // symbol
        ResultSet rs = stmt.executeQuery();
        if (!rs.next())
            Log.error("TradeJdbc:getQuote -- failure no result.next() for symbol: " + symbol);

        else
            quoteData = getQuoteDataFromResultSet(rs);
        stmt.close();
}
}
