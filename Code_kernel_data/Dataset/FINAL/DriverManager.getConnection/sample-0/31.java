public class func{
public void run(){
        conn = DriverManager.getConnection(
                "jdbc:h2:mem:", "sa", "");
        stat = conn.createStatement();
        stat.execute(
                "create table test(id int primary key, name varchar)");
}
}
