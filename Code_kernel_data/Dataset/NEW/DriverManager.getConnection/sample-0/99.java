//99
public class func{
public void getConnection0(boolean readonly){
        if (readonly) props.setProperty("hsqldb.files_readonly", "true");
        return DriverManager.getConnection(databaseUrl, props);
}
}
