//160
public class func{
public void getProxyLoadMatrix(){
        Transaction txn = Transaction.currentTxn();;
            pstmt = txn.prepareAutoCloseStatement(PROXY_ASSIGNMENT_MATRIX);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
              l.add(new Pair<Long, Integer>(rs.getLong(1), rs.getInt(2)));
            }
}
}
