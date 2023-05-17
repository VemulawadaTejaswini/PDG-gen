public class func{
public void getLastVmDiskStatsId(){
        TransactionLegacy txn = TransactionLegacy.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return Long.valueOf(rs.getLong(1));
            }
}
}
