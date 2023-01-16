//186
public class func{
	public void getLastAccountId(){
        Transaction txn = Transaction.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return Long.valueOf(rs.getLong(1));
            }
}
}
