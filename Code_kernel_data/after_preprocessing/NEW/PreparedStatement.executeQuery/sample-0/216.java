//216
public class func{
public void getHighestCurrKey(String table,String keyName){
            stmt = conn.prepareStatement("SELECT MAX(" + keyName + 
                ") FROM " + table);
            rs = stmt.executeQuery();
            rs.next();
            return rs.getInt(1);  
            DBUtil.closeJDBCObjects(ctx, null, stmt, rs);
}
}
