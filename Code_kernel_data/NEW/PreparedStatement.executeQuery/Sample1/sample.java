//0
public class func{
	public void testMappingsWithEmbedEnumAndEnumDBTypes(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'VALUE_1'::enumeration as a, 'VALUE_2'::enumeration as b, 'str' as str");
        final ResultSet rs = ps.executeQuery();
}
}
//1
public class func{
	public void testPrimitiveMappingsWithEmbed(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 1 as i, 2 as l, 'c' as c, 'str' as str");
        final ResultSet rs = ps.executeQuery();
}
}
//2
public class func{
	public void testListWithEmptyEnums(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'str' as str, ARRAY[]::enumeration[] as enum_arr");
        final ResultSet rs = ps.executeQuery();
}
}
//3
public class func{
	public void test(){
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                int size = result.getMetaData().getColumnCount();
}
}
//4
public class func{
	public void setup(){
        connection = (Connection)((AbstractSession)getSession()).getAccessor().getDatasourceConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT EMP_ID FROM EMPLOYEE");
        ResultSet result = statement.executeQuery();
        int size = result.getMetaData().getColumnCount();
}
}
//5
public class func{
	public void testObjectWithNullList(){
        final PreparedStatement ps = connection.prepareStatement("SELECT null as arr, 'str' as str ");
        final ResultSet rs = ps.executeQuery();
}
}
//6
public class func{
	public void testListWithInvalidEnums(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'str' as str, ARRAY['VALUE_3'::enumeration]::enumeration[] as enum_arr");
        ps.executeQuery();
}
}
//7
public class func{
	public void testEnumMappings(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 0 as a, 'VALUE_2' as b");
        final ResultSet rs = ps.executeQuery();
}
}
//8
public class func{
	public void testDateTimeMappings(){
        final PreparedStatement ps = connection.prepareStatement("SELECT lt, gt, zone from tmp.test_time");
        final ResultSet rs = ps.executeQuery();
}
}
//9
public class func{
	public void testColumnMappings(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 2 as l, 'c' as c");
        final ResultSet rs = ps.executeQuery();
}
}
//10
public class func{
	public void testHStoreNull(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 'str' as str, null as map");
        final ResultSet rs = ps.executeQuery();
}
}
//11
public class func{
	public void enumTransformation(){
        final PreparedStatement stmt = connection.prepareStatement(String.format("SELECT '%s' AS male_female;",
                    dbCode));
        final ResultSet result = stmt.executeQuery();
}
}
//12
public class func{
	public void testPrimitives(){
        final PreparedStatement ps = connection.prepareStatement("SELECT tmp.primitives_function();");
        final ResultSet rs = ps.executeQuery();
}
}
//13
public class func{
	public void testNullString(){
        final PreparedStatement ps = connection.prepareStatement("SELECT null as str");
        final ResultSet rs = ps.executeQuery();
}
}
//14
public class func{
	public void testPrimitiveMappings(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 1 as i, 2 as l, 'c' as c");
        final ResultSet rs = ps.executeQuery();
}
}
//15
public class func{
	public void testPrimitiveBigDecimalMapper(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 1 as i");
        final ResultSet rs = ps.executeQuery();
}
}
//16
public class func{
	public void testObjectStringMappingWithNullString(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT ROW(1,2,'c', null)::tmp.simple_type_for_embed as obj");
        final ResultSet rs = ps.executeQuery();
}
}
//17
public class func{
	public void testInvalidTimeout(){
        connection.setAutoCommit(true);
        PreparedStatement statement = connection.prepareStatement("select 'hello'");
            statement.setQueryTimeout(-1);
        ResultSet resultSet = statement.executeQuery();
        resultSet.close();
}
}
//18
public class func{
	public void select(String sql,Class<T> clazz){
            sql = sql.replaceAll("\\{namespace\\}", tableNamespace);
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            throw new RuntimeException("Could no run sql: " + sql, ex);
}
}
//19
public class func{
	public void testNullObjectInObject(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'str' as str, ROW(null,'str')::tmp.complex_type as obj");
        final ResultSet rs = ps.executeQuery();
}
}
//20
public class func{
	public void testHStoreFilled(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 'str' as str, hstore('key', 'val') as map");
        final ResultSet rs = ps.executeQuery();
}
}
//21
public class func{
	public void testEnumMappingsWithEnumInComplexType(){
        final PreparedStatement ps = connection.prepareStatement(
                "select * from simple_with_enumeration_type_function();");
        final ResultSet rs = ps.executeQuery();
}
}
//22
public class func{
	public void testObjectWithEmptyList(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT ROW(ARRAY[]::tmp.simple_type[], 'str')::tmp.array_type as obj, 'str' as str ");
        final ResultSet rs = ps.executeQuery();
}
}
//23
public class func{
	public void testPrimitivesWithSearchPath(){
        DbFunctionRegister.reInitRegistry(connection);
        final PreparedStatement ps = connection.prepareStatement("SELECT primitives_function();");
        final ResultSet rs = ps.executeQuery();
}
}
//24
public class func{
	public void testSimpleStringSet(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'str' as str, ARRAY['result_1', 'result_2']::text[] as arr");
        final ResultSet rs = ps.executeQuery();
}
}
