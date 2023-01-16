//154
public class func{
	public void executeSql(Statement st,String sql){
        log.trace("SQL: " + sql);
        st.execute(sql);
}
}
