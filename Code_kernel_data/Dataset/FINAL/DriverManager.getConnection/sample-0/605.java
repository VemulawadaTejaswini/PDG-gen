public class func{
public void shouldAttachDetachConnection(){
        Connection connection = DriverManager.getConnection(url(), user(), password());
        Base.attach(connection);
        a(Base.connection()).shouldNotBeNull();
}
}
