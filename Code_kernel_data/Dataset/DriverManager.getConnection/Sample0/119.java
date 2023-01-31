//118
public class func{
	public void PersonMapStore(){
            con = DriverManager.getConnection("jdbc:hsqldb:mydatabase", "SA", "");
            con.createStatement().executeUpdate(
                    "create table if not exists person (id bigint not null, name varchar(45), primary key (id))");
}
}
