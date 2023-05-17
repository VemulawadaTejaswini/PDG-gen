public class func{
public void ConnectToDB(){
        con = DriverManager.getConnection(connectionname,dbUser,dbPassword);
        stmt= con.createStatement();
        meta= this.con.getMetaData();
}
}
