public class func{
public void openConnection(){
    connection = DriverManager.getConnection("jdbc:mysql:
        + this.hostname + ":" + this.port + "/" + this.database,
        this.user, this.password);
}
}
