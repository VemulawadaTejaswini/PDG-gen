public class func{
public void testPartialRangeFilter(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = new PhoenixPreparedStatement(pconn, query);
        QueryPlan plan = pstmt.optimizeQuery();
        Scan scan = plan.getContext().getScan();
        assertNull(scan.getFilter());
        byte[] wideLower = ByteUtil.nextKey(StringUtil.padChar(Bytes.toBytes(tenantId1), 15));
        byte[] wideUpper = StringUtil.padChar(Bytes.toBytes(tenantId2), 15);
}
}
