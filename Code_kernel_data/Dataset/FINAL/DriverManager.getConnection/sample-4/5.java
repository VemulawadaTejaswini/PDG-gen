public class func{
public void getConnection(boolean fresh){
        if (this.connection == null) {
            this.connection =
                DriverManager.getConnection(this.connectString, null);
        }
}
}
