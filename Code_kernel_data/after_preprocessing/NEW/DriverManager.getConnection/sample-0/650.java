//650
public class func{
public void urlTest3(){
            Connection conn = DriverManager.getConnection("jdbc:hbql;maxtablerefs=44");
            ConnectionImpl connimpl = (ConnectionImpl)conn;
            maxrefs = connimpl.getHConnectionImpl().getMaxTablePoolReferencesPerTable();
}
}
