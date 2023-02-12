public class func{
public void testSelectForceRangeScanForEH(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("create table eh (organization_id char(15) not null,parent_id char(15) not null, created_date date not null, entity_history_id char(15) not null constraint pk primary key (organization_id, parent_id, created_date, entity_history_id))");
        ResultSet rs = conn.createStatement().executeQuery("explain select /*+ RANGE_SCAN */ ORGANIZATION_ID, PARENT_ID, CREATED_DATE, ENTITY_HISTORY_ID from eh where ORGANIZATION_ID='111111111111111' and SUBSTR(PARENT_ID, 1, 3) = 'foo' and TO_DATE ('2012-0-1 00:00:00') <= CREATED_DATE and CREATED_DATE <= TO_DATE ('2012-11-31 00:00:00') order by ORGANIZATION_ID, PARENT_ID, CREATED_DATE DESC, ENTITY_HISTORY_ID limit 100");
        assertEquals("CLIENT PARALLEL 1-WAY RANGE SCAN OVER EH ['111111111111111','foo','2011-12-01 00:00:00.000'] - ['111111111111111','fop','2012-12-01 00:00:00.000']\n" + 
                "    SERVER FILTER BY (CREATED_DATE >= 2011-11-30 AND CREATED_DATE <= 2012-11-30)\n" + 
                "    SERVER TOP 100 ROWS SORTED BY [ORGANIZATION_ID, PARENT_ID, CREATED_DATE DESC, ENTITY_HISTORY_ID]\n" + 
                "CLIENT MERGE SORT",QueryUtil.getExplainPlan(rs));
}
}
