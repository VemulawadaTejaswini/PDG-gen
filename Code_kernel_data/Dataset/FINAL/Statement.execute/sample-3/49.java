public class func{
public void setUp(){
                    Connection con = getConnection();
                    Statement stmt = con.createStatement();
                    stmt.execute("create table UpdateTestTableResultSet (" +
                            "sno int not null unique," +
                            "dBlob BLOB," +
                            "dClob CLOB," +
                            "dLongVarchar LONG VARCHAR," +
                            "dLongBit LONG VARCHAR FOR BIT DATA)");
                    stmt.close();
}
}
