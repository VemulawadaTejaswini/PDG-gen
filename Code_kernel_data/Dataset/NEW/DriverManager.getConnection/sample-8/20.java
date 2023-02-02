//20
public class func{
public void testReturnGeneratedKeys(){
        Connection con = DriverManager.getConnection("jdbc:derby:memory:derby1;create=true");
        con.prepareStatement(
                "create table note(id integer not null generated always as identity (start with 1, increment by 1),\n"
                        + "text varchar(255) not null)").execute();
}
}
