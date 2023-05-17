public class func{
public void connect(){
        if (this.user != null && !this.user.isEmpty()) {
            try {
                this.connection = DriverManager.getConnection(this.url, this.user, this.pwd);
            } catch (SQLException ex) {
                throw new IllegalStateException("Cannot fetch connection", ex);
            }
        } else {
            try {
                this.connection = DriverManager.getConnection(this.url);
            } catch (SQLException ex) {
                throw new IllegalStateException("Cannot fetch connection", ex);
            }
        }
}
}
