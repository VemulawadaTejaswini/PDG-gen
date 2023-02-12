public class func{
public void readSHPConstraintTest(){
        st.execute("CALL FILE_TABLE('"+SHPEngineTest.class.getResource("waternetwork.shp").getPath()+"', 'SHPTABLE');");
}
}
