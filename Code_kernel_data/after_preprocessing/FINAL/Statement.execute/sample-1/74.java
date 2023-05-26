public class func{
public void setSchema(String schema){
    Statement stmt = createStatement();
    stmt.execute("use " + schema);
    stmt.close();
}
}
