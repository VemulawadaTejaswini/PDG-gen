//19
public class func{
public void executeInsert(){
            Statement statement = connection.createStatement();
                statement.execute("insert into employee (name) values ('john doe')");
                statement.close();
}
}
