//251
public class func{
public void getProxyActiveLoad(long proxyVmId){
        Transaction txn = Transaction.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(GET_PROXY_ACTIVE_LOAD);
            pstmt.setLong(1, proxyVmId);
            ResultSet rs = pstmt.executeQuery();
            if(rs != null && rs.first()) {
                return rs.getInt(1);
            }
}
}
