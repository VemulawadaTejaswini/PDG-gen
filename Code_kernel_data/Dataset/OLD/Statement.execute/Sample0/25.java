//24
public class func{
	public void copySHPTestAutomaticTableName(){
        final String path = StringUtils.quoteStringSQL(SHPEngineTest.class.getResource("waternetwork.shp").getPath());
        st.execute("CALL SHPRead(" + path + ", 'waternetwork');");
        checkSHPReadResult(st);
}
}
