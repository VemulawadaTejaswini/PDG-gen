public class func{
public void nextConnection(){
        Connection con = DriverManager.getConnection(DatabaseCreator.nextUrl());
        DatabaseCreator.createDatabase(con);
}
}
