public class func{
public void setRowCountBase(Statement stmt,boolean onClient,long rowCountBase){
            stmt.execute( "call setRowCountBase( " + rowCountBase + " )" );
}
}
