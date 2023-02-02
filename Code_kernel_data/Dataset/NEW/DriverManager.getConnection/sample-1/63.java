//63
public class func{
public void init(){
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:db1",
                    "sa", "");
            conn.createStatement().execute(
                    "RUNSCRIPT FROM 'classpath:/world.sql'");
}
}
