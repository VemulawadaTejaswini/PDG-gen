//11
public class func{
public void testSelectAllRowsWithDifferentFetchSizes(boolean salted){
        Connection conn = DriverManager.getConnection(getUrl());
        PreparedStatement stmt = conn.prepareStatement("SELECT K, V FROM " + tableName);
        tryWithFetchSize(new HashSet<>(expectedKeys), 1, stmt, 0);
        tryWithFetchSize(new HashSet<>(expectedKeys), 2, stmt, salted ? 2 : 5);
}
}
