//8
public class func{
public void testIndexPlanSelectionIfBothGlobalAndLocalIndexesHasSameColumnsAndOrder(){
        createBaseTable(TestUtil.DEFAULT_DATA_TABLE_NAME, null, "('e','i','o')");
        Connection conn1 = DriverManager.getConnection(getUrl());
        conn1.createStatement().execute("UPSERT INTO "+TestUtil.DEFAULT_DATA_TABLE_NAME+" values('b',1,2,4,'z')");
        conn1.createStatement().execute("UPSERT INTO "+TestUtil.DEFAULT_DATA_TABLE_NAME+" values('f',1,2,3,'a')");
        conn1.createStatement().execute("UPSERT INTO "+TestUtil.DEFAULT_DATA_TABLE_NAME+" values('j',2,4,3,'a')");
        conn1.createStatement().execute("UPSERT INTO "+TestUtil.DEFAULT_DATA_TABLE_NAME+" values('q',3,1,1,'c')");
}
}
