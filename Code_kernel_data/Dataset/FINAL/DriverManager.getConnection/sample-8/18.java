public class func{
public void call(){
                    Connection c = DriverManager.getConnection(url, user, password);
                    PreparedStatement prep = c
                            .prepareStatement("insert into employee values(?, ?, 0)");
}
}
