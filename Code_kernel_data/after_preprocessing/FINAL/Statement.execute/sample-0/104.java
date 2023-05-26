public class func{
public void emptyStatementCache(){
        Statement s = createStatement();
        s.execute("CALL SYSCS_UTIL.SYSCS_EMPTY_STATEMENT_CACHE()");
        closeStatement(s);
}
}
