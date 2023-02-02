//171
public class func{
	public void getSecHostId(long volumeId){
        TransactionLegacy txn = TransactionLegacy.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(sql);
            pstmt.setLong(1, volumeId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
}
}
