//197
public class func{
	public void setUp(){
        upsertListener = mock(CsvUpsertExecutor.UpsertListener.class);
        conn = DriverManager.getConnection(getUrl());
        upsertExecutor = new CsvUpsertExecutor(conn, columnInfoList, preparedStatement, upsertListener, ":");
}
}
