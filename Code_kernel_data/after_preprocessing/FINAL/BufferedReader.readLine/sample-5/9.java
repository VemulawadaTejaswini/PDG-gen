public class func{
public void testSqlGeneration(){
        File sqlFile = new File( TARGET_DIR, SQL_FILE );
        BufferedReader in = new BufferedReader( new FileReader( sqlFile ) );
        String sqlIn = in.readLine();
        assertEquals( VALID_SQL, sqlIn );
}
}
