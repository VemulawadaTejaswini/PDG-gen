//0
public class func{
	public void testArrayToStringFunctionWithNulls8(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(ARRAY[NULL, NULL, 'a', 'b', NULL, 'c', 'd', NULL, 'e', NULL, NULL], ', ') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//1
public class func{
	public void testArrayToStringFunctionWithNulls7(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(ARRAY[NULL, NULL, 'a', 'b', NULL, 'c', 'd', NULL, 'e', NULL, NULL], ', ', '*') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//2
public class func{
	public void testUpsertValuesOnlyUpsertsTenantData(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_TENANT_SPECIFIC_URL);
            conn.setAutoCommit(true);
            int count = conn.createStatement().executeUpdate("upsert into " + TENANT_TABLE_NAME + " (id, user) values (1, 'Bon Scott')");
            assertEquals("Expected 1 row to have been inserted", 1, count);
            ResultSet rs = conn.createStatement().executeQuery("select count(*) from " + TENANT_TABLE_NAME);
            rs.next();
            assertEquals(1, rs.getInt(1));
            conn.close();
}
}
//3
public class func{
	public void testArrayToStringFunctionDouble1(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(doubles, ', ') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//4
public class func{
	public void testArrayToStringFunctionWithNestedFunctions3(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(ARRAY[ARRAY_ELEM(doubles, 1), ARRAY_ELEM(doubles, 1)], ', ') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//5
public class func{
	public void testArrayAppendFunctionInWhere4(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY[23.45,4634.5,2.3234,123.4]=ARRAY_APPEND(ARRAY[23.45,4634.5,2.3234],123.4)");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
//6
public class func{
	public void testArrayPrependFunctionInWhere5(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY['foo','2345','46345','23234']=ARRAY_PREPEND('foo',varchars)");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
//7
public class func{
	public void testArrayToStringFunctionBigint(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(bigints, ', ') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//8
public class func{
	public void testArrayToStringFunctionDouble2(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(ARRAY[2.3, 4.5], ', ') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//9
public class func{
	public void testArrayToStringFunctionInWhere6(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY_TO_STRING(ARRAY[1,2,3], varchar1) = '1, 2, 3'");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
//10
public class func{
	public void testArrayToStringFunctionWithNulls5(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(ARRAY['a', 'b', NULL], ', ', '*') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//11
public class func{
	public void testArrayToStringFunctionVarchar1(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(varchars, ',','*') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//12
public class func{
	public void testCeilDate(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT CEIL(dt, 'day', 1), CEIL(dt, 'hour', 1), CEIL(dt, 'minute', 1), CEIL(dt, 'second', 1) FROM t1");
        assertTrue(rs.next());
}
}
//13
public class func{
	public void testNullReverse(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ASC", s);
        rs = conn.createStatement().executeQuery("SELECT reverse(kv) FROM REVERSE_TEST");
        assertTrue(rs.next());
        assertNull(rs.getString(1));
        assertFalse(rs.next());
}
}
//14
public class func{
	public void testArrayToStringFunctionInWhere2(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE 'a,b,c' = ARRAY_TO_STRING(ARRAY['a', 'b', 'c'], ',')");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
//15
public class func{
	public void testArrayFillFunctionInWhere4(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY[23.45, 23.45, 23.45]=ARRAY_FILL(23.45, 3)");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
//16
public class func{
	public void testArrayToStringFunctionChar1(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(chars, ', ') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//17
public class func{
	public void testSettingsAsProperties(){
        String url = getURL("driver", true);
        Connection conn = DriverManager.getConnection(url, prop);
        rs = conn.createStatement().executeQuery(
                "select * from information_schema.settings where name='MAX_COMPACT_TIME'");
        rs.next();
        assertEquals(1234, rs.getInt(2));
        conn.close();
}
}
//18
public class func{
	public void testFloorDateInWhere(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM t1 WHERE FLOOR(dt, 'hour') = to_date('2012-01-01 14:00:00')");
        assertTrue(rs.next());
}
}
//19
public class func{
	public void testCeilDouble(){
    Connection conn = DriverManager.getConnection(getUrl());
    ResultSet rs = conn.createStatement().executeQuery("SELECT CEIL(doub), CEIL(doub, 1), CEIL(doub, 2), CEIL(doub, 3) FROM t1");
    assertTrue(rs.next());
    assertEquals(0, Doubles.compare(2, rs.getDouble(1)));
    assertEquals(0, Doubles.compare(1.3, rs.getDouble(2)));
    assertEquals(0, Doubles.compare(1.27, rs.getDouble(3)));
    assertEquals(0, Doubles.compare(1.264, rs.getDouble(4)));
}
}
//20
public class func{
	public void testCeilDateInWhere(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ROUND_DATE_TIME_TS_DECIMAL WHERE CEIL(dt, 'second') = to_date('2012-01-01 14:25:29')");
        assertTrue(rs.next());
}
}
//21
public class func{
	public void testSplit_InFilter(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ONE,TWO,THREE");
        ResultSet rs = conn.createStatement().executeQuery(
                "SELECT ID FROM SPLIT_TEST WHERE (REGEXP_SPLIT(VAL, ','))[1] = 'ONE'");
        assertTrue(rs.next());
        assertEquals(1, rs.getInt(1));
        assertFalse(rs.next());
}
}
//22
public class func{
	public void testArrayToStringFunctionInWhere5(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE 'a, bbbb, c, ddd, e' = ARRAY_TO_STRING(ARRAY['a', 'bbbb', 'c' , 'ddd', 'e'], ', ')");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
//23
public class func{
	public void testArrayToStringFunctionInWhere3(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE '1.1,2.2,3.3' = ARRAY_TO_STRING(ARRAY[1.1, 2.2, 3.3], ',')");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
//24
public class func{
	public void testSplit_ArrayReference(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ONE,TWO,THREE");
        ResultSet rs = conn.createStatement().executeQuery(
                "SELECT REGEXP_SPLIT(VAL, ',')[1] FROM SPLIT_TEST");
        assertTrue(rs.next());
        assertEquals("ONE", rs.getString(1));
        assertFalse(rs.next());
}
}
//25
public class func{
	public void testSplit_NullDynamicSeparator(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ONE,TWO,THREE", null);
        ResultSet rs = conn.createStatement().executeQuery(
                "SELECT REGEXP_SPLIT(VAL, SEP) FROM SPLIT_TEST");
        assertTrue(rs.next());
        assertNull(rs.getString(1));
        assertFalse(rs.next());
}
}
//26
public class func{
	public void testArrayFillFunctionInWhere3(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY['2345', '2345', '2345', '2345']=ARRAY_FILL('2345', 4)");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
//27
public class func{
	public void testArrayToStringFunctionWithNulls3(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(ARRAY[NULL, 'a', 'b'], ', ', '*') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//28
public class func{
	public void testArrayToStringFunctionWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(ARRAY['a', NULL, 'b'], ', ','*') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
//29
public class func{
	public void testRoundingUpDate(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT ROUND(dt, 'day'), ROUND(dt, 'hour', 1), ROUND(dt, 'minute', 1), ROUND(dt, 'second', 1), ROUND(dt, 'millisecond', 1) FROM ROUND_DATE_TIME_TS_DECIMAL");
        assertTrue(rs.next());
}
}
//30
public class func{
	public void testRoundingUpTimestamp(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT ROUND(ts, 'day'), ROUND(ts, 'hour', 1), ROUND(ts, 'minute', 1), ROUND(ts, 'second', 1), ROUND(ts, 'millisecond', 1) FROM ROUND_DATE_TIME_TS_DECIMAL");
        assertTrue(rs.next());
}
}
//31
public class func{
	public void testRoundingUpDecimal(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT ROUND(dec), ROUND(dec, 1), ROUND(dec, 2), ROUND(dec, 3) FROM t1");
        assertTrue(rs.next());
}
}
//32
public class func{
	public void testFalseOrFalse(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        ResultSet rs = conn.createStatement().executeQuery("SELECT (FALSE OR FALSE) AS B FROM SYSTEM.CATALOG LIMIT 1");
        assertTrue(rs.next());
        assertFalse(rs.getBoolean(1));
        conn.close();
}
}
//33
public class func{
	public void testRoundingUpDecimalInWhere(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM t1 WHERE ROUND(dec, 2) = 1.26");
        assertTrue(rs.next());
}
}
//34
public class func{
	public void testArrayPrependFunctionNulls1(){
        conn = DriverManager.getConnection(getUrl());
        rs = conn.createStatement().executeQuery("SELECT ARRAY_PREPEND(b,a) FROM t WHERE k = 'a'");
        assertTrue(rs.next());
        assertEquals(array2, rs.getArray(1));
}
}
//35
public class func{
	public void testFloorDate(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT FLOOR(dt, 'day', 1), FLOOR(dt, 'hour', 1), FLOOR(dt, 'minute', 1), FLOOR(dt, 'second', 1) FROM t1");
        assertTrue(rs.next());
}
}
//36
public class func{
	public void testFloorDouble(){
    Connection conn = DriverManager.getConnection(getUrl());
    ResultSet rs = conn.createStatement().executeQuery("SELECT FLOOR(doub), FLOOR(doub, 1), FLOOR(doub, 2), FLOOR(doub, 3) FROM t1");
    assertTrue(rs.next());
    assertEquals(0, Doubles.compare(1, rs.getDouble(1)));
    assertEquals(0, Doubles.compare(1.2, rs.getDouble(2)));
    assertEquals(0, Doubles.compare(1.26, rs.getDouble(3)));
    assertEquals(0, Doubles.compare(1.264, rs.getDouble(4)));
}
}
//37
public class func{
	public void testRoundFloat(){
    Connection conn = DriverManager.getConnection(getUrl());
    ResultSet rs = conn.createStatement().executeQuery("SELECT ROUND(fl), ROUND(fl, 1), ROUND(fl, 2), ROUND(fl, 3) FROM t1");
    assertTrue(rs.next());
    assertEquals(0, Floats.compare(1, rs.getFloat(1)));
    assertEquals(0, Floats.compare(1.3f, rs.getFloat(2)));
    assertEquals(0, Floats.compare(1.26f, rs.getFloat(3)));
    assertEquals(0, Floats.compare(1.264f, rs.getFloat(4)));
}
}
//38
public class func{
	public void testFloorTimestamp(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT FLOOR(ts, 'day'), FLOOR(ts, 'hour', 1), FLOOR(ts, 'minute', 1), FLOOR(ts, 'second', 1), FLOOR(ts, 'millisecond', 1) FROM ROUND_DATE_TIME_TS_DECIMAL");
        assertTrue(rs.next());
}
}
//39
public class func{
	public void testFloorDoubleInWhere(){
    Connection conn = DriverManager.getConnection(getUrl());
    ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM t1 WHERE FLOOR(doub, 2) = 1.26");
    assertTrue(rs.next());
}
}
//40
public class func{
	public void testRoundingUpDateInWhere(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM t1 WHERE ROUND(dt, 'day') = to_date('2012-01-02 00:00:00')");
        assertTrue(rs.next());
}
}
//41
public class func{
	public void testRoundingUpTime(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT ROUND(t, 'day', 1), ROUND(t, 'hour', 1), ROUND(t, 'minute', 1), ROUND(t, 'second', 1) FROM t1");
        assertTrue(rs.next());
}
}
//42
public class func{
	public void testCount(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 1));
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select count(1) from " + GROUPBYTEST_NAME);
        assertTrue(rs.next());
        assertEquals(8, rs.getInt(1));
        assertFalse(rs.next());
        conn.close();
}
}
//43
public class func{
	public void testArrayFillFunctionTimestamp(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_FILL(timestamp,3) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
}
}
//44
public class func{
	public void testArrayAppendFunctionBigIntDesc(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTablesDesc(conn, "BIGINT", "1112");
        rs = conn.createStatement().executeQuery("SELECT ARRAY_APPEND(bigints,pk) FROM regions");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("BIGINT", longs);
}
}
//45
public class func{
	public void testArrayFillFunctionDouble(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_FILL(double,4) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("DOUBLE", objects);
}
}
//46
public class func{
	public void testArrayFillFunctionInteger(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_FILL(integer,4) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("INTEGER", objects);
}
}
//47
public class func{
	public void testSplit_AlternateSeparator(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ONE:TWO:THREE");
        ResultSet rs = conn.createStatement().executeQuery(
                "SELECT REGEXP_SPLIT(VAL, ':') FROM SPLIT_TEST");
        assertTrue(rs.next());
        Array array = rs.getArray(1);
        String[] values = (String[]) array.getArray();
        assertArrayEquals(new String[] { "ONE", "TWO", "THREE" }, values);
}
}
//48
public class func{
	public void testSplit_NoSplitString(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "CANNOT BE SPLIT");
        ResultSet rs = conn.createStatement().executeQuery(
                "SELECT REGEXP_SPLIT(VAL, ',') FROM SPLIT_TEST");
        assertTrue(rs.next());
        Array array = rs.getArray(1);
        String[] values = (String[]) array.getArray();
        assertArrayEquals(new String[] { "CANNOT BE SPLIT" }, values);
}
}
//49
public class func{
	public void testArrayFillFunctionWithNestedFunctions3(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_FILL(3.4, ARRAY_LENGTH(ARRAY[34, 45])) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
}
}
//50
public class func{
	public void testArrayPrependFunctionDouble(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_PREPEND(double1,doubles) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("DOUBLE", doubles);
}
}
//51
public class func{
	public void testArrayConcatFunctionDouble(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(doubles,doubles) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("DOUBLE", doubles);
}
}
//52
public class func{
	public void testArrayConcatFunctionChar2(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(chars,ARRAY['facfacfacfacfacfacfac','facfacfacfacfacfacfac']) FROM regions WHERE region_name = 'SF Bay Area'");
        rs.next();
        rs.getArray(1);
}
}
//53
public class func{
	public void testSelectAfterUpsertInQuery(){
        Connection conn = DriverManager.getConnection(getUrl());
        initSelectAfterUpsertTable(conn);
            ResultSet rs = conn.createStatement().executeQuery(query);
            assertTrue(rs.next());
            assertEquals(0, rs.getInt(1));
            conn.close();
}
}
//54
public class func{
	public void testArrayConcatFunctionChar(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(chars,chars) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("CHAR", strings);
}
}
//55
public class func{
	public void testArrayAppendFunctionBooleanDesc(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTablesDesc(conn, "BOOLEAN", "false");
        rs = conn.createStatement().executeQuery("SELECT ARRAY_APPEND(bools,pk) FROM regions");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("BOOLEAN", booleans);
}
}
//56
public class func{
	public void testArrayPrependFunctionVarchar(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_PREPEND('34567',varchars) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("VARCHAR", strings);
}
}
//57
public class func{
	public void testArrayAppendFunctionVarcharDesc(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTablesDesc(conn, "VARCHAR", "'e'");
        rs = conn.createStatement().executeQuery("SELECT ARRAY_APPEND(varchars,pk) FROM regions");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("VARCHAR", strings);
}
}
//58
public class func{
	public void testArrayPrependFunctionIntegerDesc(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTablesDesc(conn, "INTEGER", "23");
        rs = conn.createStatement().executeQuery("SELECT ARRAY_PREPEND(pk,integers) FROM regions");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("INTEGER", integers);
}
}
//59
public class func{
	public void testArrayConcatFunctionBigint(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(bigints,bigints) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("BIGINT", longs);
}
}
//60
public class func{
	public void testArrayPrependFunctionInteger(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_PREPEND(1234,integers) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("INTEGER", integers);
}
}
//61
public class func{
	public void test_4(){
        Connection conn = DriverManager.getConnection("jdbc:mock:");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT 'ABCDE' FROM DUAL");
        Assert.assertTrue(rs.next());
        Assert.assertEquals("ABCDE", rs.getString(1));
        rs.close();
}
}
//62
public class func{
	public void assertConnection(int port){
        final Connection conn = DriverManager.getConnection(connectionStr);
            final Statement stmt = conn.createStatement();
            final ResultSet rs = stmt.executeQuery("values(1)"); // Derby doesn't like "SELECT 1" as validation query
            while (rs.next()) {
                valueFound = true;
                Assert.assertEquals("1", rs.getString(1));
            }
            Assert.assertTrue("No value found.", valueFound);
}
}
//63
public class func{
	public void getDateAsString(){
    Connection conn = DriverManager
        .getConnection("jdbc:default:connection");
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT CURRENT_DATE");
      if (rs.next())
        return rs.getDate(1).toString();
      if (rs != null)
        rs.close();
      if (stmt != null)
        stmt.close();
      conn.close();
}
}
//64
public class func{
	public void test_0(){
        Connection conn = DriverManager.getConnection("jdbc:mock:");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT 2");
        Assert.assertTrue(rs.next());
        Assert.assertEquals(2, rs.getInt(1));
        rs.close();
}
}
//65
public class func{
	public void countRows(String schema,String table){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement s = conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT COUNT(*) FROM " + schema + "." + table);
    rs.next();
    int count = rs.getInt(1);
    rs.close();
}
}
//66
public class func{
	public void currentPatches(String database){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:orders", "sa", "");
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM patches");
        while (resultSet.next()) {
            log.info("Result " + resultSet.getInt(2));
        }
        SqlUtil.close(conn, stmt, null);
}
}
//67
public class func{
	public void getNumOfEventsInStore(){
        con = DriverManager.getConnection(URL);
        Statement stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery(countQuery);
        resultSet.next();
        return resultSet.getInt(1);
}
}
//68
public class func{
	public void countTestRecords(int[] count){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
            Statement ps1 = conn.createStatement();
            ResultSet resultSet = ps1.executeQuery("SELECT COUNT(*) FROM PLANET");
            resultSet.next();
            count[0] = resultSet.getInt(1);
}
}
//69
public class func{
	public void test_2(){
        Connection conn = DriverManager.getConnection("jdbc:mock:");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT NOW()");
        Assert.assertTrue(rs.next());
        Assert.assertTrue(rs.getObject(1) instanceof Timestamp);
        rs.close();
}
}
//70
public class func{
	public void main(String args[]){
          Connection conn = DriverManager.getConnection
              ("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
          Statement stmt = conn.createStatement();
          ResultSet rset = stmt.executeQuery("select* from belli");
          while (rset.next())
                System.out.println (rset.getString(1));   // Print col 1
          stmt.close();
}
}
//71
public class func{
	public void POSTGRESCollector(String oriDBUrl,String username,String password){
            Connection conn = DriverManager.getConnection(oriDBUrl, username, password);
            Catalog.setSeparator(conn);
            Statement s = conn.createStatement();
            ResultSet out = s.executeQuery("SHOW ALL;");
            while(out.next()) {
                dbConf.put(out.getString("name"), out.getString("setting"));
            }
}
}
//72
public class func{
	public void getVarcharFromDb(int id){
        Connection con = DriverManager.getConnection("jdbc:default:connection");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT CHARDATA FROM CSDATA " +
                "WHERE ID = " + id);
        rs.next();
        String chardata = rs.getString(1);
        rs.close();
}
}
//73
public class func{
	public void getSchemaTransition(String nextSchema){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("VALUES CURRENT SCHEMA");
        rs.next();
        String prevSchema = rs.getString(1);
        rs.close();
}
}
//74
public class func{
	public void main2(String[] args){
    Connection conn = DriverManager.getConnection(
        "jdbc:h2:tcp://localhost:9092/mydb", "sa", "");
    Statement stmt = conn.createStatement();
    stmt.executeUpdate("INSERT INTO my_table(name) VALUES('zhh')");
    ResultSet rs = stmt.executeQuery("SELECT name FROM my_table");
    rs.next();
    System.out.println(rs.getString(1));
}
}
//75
public class func{
	public void test_1(){
        Connection conn = DriverManager.getConnection("jdbc:mock:");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT NULL");
        Assert.assertTrue(rs.next());
        Assert.assertEquals(0, rs.getInt(1));
        Assert.assertEquals(null, rs.getObject(1));
        rs.close();
}
}
//76
public class func{
	public void exists(final int id){
        final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        final Statement statement = connection.createStatement();
        final ResultSet result = statement.executeQuery("SELECT count(*) AS NB FROM " + TABLE + " WHERE ID = " + id);
            assertTrue(result.next());
            return result.getInt(1) == 1;
}
}
//77
public class func{
	public void accessSql(){
                DriverManager.getConnection(
                    "jdbc:default:connection");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("values 777");
            rs.next();
            return rs.getInt(1);
}
}
//78
public class func{
	public void count(final String where){
        final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        final Statement statement = connection.createStatement();
        final ResultSet result = statement.executeQuery("SELECT count(*) AS NB FROM " + TABLE + where);
            assertTrue(result.next());
            return result.getInt(1);
}
}
//79
public class func{
	public void run(){
                    Connection conn = DriverManager.getConnection(getUrl());
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from test where name = 'name2'");
                    while (rs.next()) {
                        // Just make sure we run over all records
                    }
                    rs.close();
}
}
//80
public class func{
	public void testConnectionUrl(){
        Connection c = DriverManager.getConnection(url, this.username, this.password);
        ResultSet rs = c.createStatement().executeQuery("select user()");
        rs.next();
        String userFromDb = rs.getString(1).split("@")[0];
        assertEquals(this.username, userFromDb);
        rs.close();
}
}
//81
public class func{
	public void getNumOfEventsInStore(){
        con = DriverManager.getConnection(URL);
        Statement stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery(countQuery);
        while(resultSet.next()) {
          count++;
        }
}
}
//82
public class func{
	public void MYSQLCollector(String oriDBUrl,String username,String password){
        String dbUrl = oriDBUrl.substring(0, oriDBUrl.lastIndexOf('/'));
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            Catalog.setSeparator(conn);
            Statement s = conn.createStatement();
            ResultSet out = s.executeQuery("SELECT * FROM GLOBAL_VARIABLES;");
            while(out.next()) {
                dbConf.put(out.getString("VARIABLE_NAME"), out.getString("VARIABLE_VALUE"));
            }
}
}
//83
public class func{
	public void shouldPingDatabase(){
    Connection conn = DriverManager.getConnection("jdbc:derby:memory:chapter02DB;create=true", "APP2", "APP");
    conn.createStatement().executeQuery("SELECT 1 FROM SYSIBM.SYSDUMMY1");
}
}
//84
public class func{
	public void retrieveExternalResult(String dbName,String user,String password,ResultSet[] external){
        Connection conn = DriverManager.getConnection(url, user, password);
            conn.createStatement().executeQuery("VALUES(1)");
}
}
//85
public class func{
	public void testFailNoFromClauseSelect(){
         Connection conn = DriverManager.getConnection(getUrl());
             conn.createStatement().executeQuery("SELECT foo, bar");
}
}
//86
public class func{
	public void retrieveExternalResult(String dbName,String user,String password,ResultSet[] external){
        Connection conn = DriverManager.getConnection(create_url);
        external[0] = conn.createStatement().executeQuery("VALUES(1)");
}
}
//87
public class func{
	public void testArrayConcatFunctionIntToCharArray(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(varchars,ARRAY[23,45]) FROM regions WHERE region_name = 'SF Bay Area'");
}
}
//88
public class func{
	public void testSplit_Upsert(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ONE,TWO,THREE");
        conn.createStatement().executeUpdate("UPSERT INTO SPLIT_TEST (ID, ARR) SELECT ID, " +
                "REGEXP_SPLIT(VAL, ',') FROM SPLIT_TEST");
}
}
//89
public class func{
	public void setUp(){
        Connection connection = DriverManager.getConnection(Framework.getProperty(URL_PROPERTY),
                Framework.getProperty(USER_PROPERTY), Framework.getProperty(PASSWORD_PROPERTY));
            doOnAllTables(connection, null, "public", "DROP TABLE \"%s\" CASCADE");
            Statement st = connection.createStatement();
            executeSql(st, "DROP SEQUENCE IF EXISTS hierarchy_seq");
            st.close();
}
}
