public class func{
public void getConnection(){
    if (this.connection==null || this.connection.isClosed())
      this.connection=DriverManager.getConnection(url,user,password);
}
}
