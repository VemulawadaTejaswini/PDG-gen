public class func{
public void testCompressTableWithDoubleQuoteInName(){
        Statement s = createStatement();
        s.execute("drop table app.\"abc\"\"def\"");
}
}
