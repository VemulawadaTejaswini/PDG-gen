//42
public class func{
	public void loadSQL(Connection connection,String resource,HypersonicPreprocessor sqlPreprocessor){
        if (sqlPreprocessor != null) {
            sql = sqlPreprocessor.preprocessSQL(sql);
        }
        stmt.execute(sql);
        stmt.close();
}
}
