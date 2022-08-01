//214
public class func{
	public void listUpdatedStats(){
        TransactionLegacy txn = TransactionLegacy.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(UPDATED_STATS_SEARCH);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                userStats.add(toEntityBean(rs, false));
            }
}
}
