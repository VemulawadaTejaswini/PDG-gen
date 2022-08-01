//47
public class func{
	public void testMetaDataGetTablesClassic(){
    stmt.execute("set " + HiveConf.ConfVars.HIVE_SERVER2_TABLE_TYPE_MAPPING.varname +
        " = " + TableTypeMappings.CLASSIC.toString());
    stmt.close();
}
}
