//123
public class func{
	public void testMetaDataGetTablesHive(){
    stmt.execute("set " + HiveConf.ConfVars.HIVE_SERVER2_TABLE_TYPE_MAPPING.varname +
        " = " + TableTypeMappings.HIVE.toString());
}
}
