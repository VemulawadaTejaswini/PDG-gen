//46
public class func{
public void testMetaDataGetClassicTableTypes(){
    stmt.execute("set " + HiveConf.ConfVars.HIVE_SERVER2_TABLE_TYPE_MAPPING.varname +
        " = " + TableTypeMappings.CLASSIC.toString());
    stmt.close();
}
}
