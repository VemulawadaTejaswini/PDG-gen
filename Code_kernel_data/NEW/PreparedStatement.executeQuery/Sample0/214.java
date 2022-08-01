//213
public class func{
	public void listUpdatedStats(){
        TransactionLegacy txn = TransactionLegacy.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(UPDATED_VM_NETWORK_STATS_SEARCH);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                vmDiskStats.add(toEntityBean(rs, false));
            }
}
}
