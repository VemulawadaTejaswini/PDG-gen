//25
public class func{
	public void copySHPTest(){
        final String path = StringUtils.quoteStringSQL(SHPEngineTest.class.getResource("waternetwork.shp").getPath());
        st.execute("CALL SHPRead(" + path + ", 'WATERNETWORK');");
        checkSHPReadResult(st);
}
}
