public class func{
public void ConnectToDB(){
        con = DriverManager.getConnection(connectionname,dbUser,dbPassword);
        stmt= con.createStatement();  ///// changed 20.03.2013
        meta= this.con.getMetaData();
}
}
