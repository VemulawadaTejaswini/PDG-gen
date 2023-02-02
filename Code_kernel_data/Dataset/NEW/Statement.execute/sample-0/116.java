//116
public class func{
public void executeDDL(String ddl){
        Statement statement = getConnection().createStatement();
        statement.execute(ddl);
}
}
