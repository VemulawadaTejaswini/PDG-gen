//73
public class func{
public void testGetSplitsWithSkipScanFilter(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        PhoenixConnection pconn = conn.unwrap(PhoenixConnection.class);
        PTable table = pconn.getMetaDataCache().getTable(new PTableKey(pconn.getTenantId(), TABLE_NAME));
        TableRef tableRef = new TableRef(table);
        List<HRegionLocation> regions = pconn.getQueryServices().getAllTableRegions(tableRef.getTable().getPhysicalName().getBytes());
        List<KeyRange> ranges = getSplits(tableRef, scan, regions, scanRanges);
        assertEquals("Unexpected number of splits: " + ranges.size(), expectedSplits.size(), ranges.size());
}
}
