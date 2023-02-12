public class func{
public void run(){
                    Statement statement = conn.createStatement();
                    statement.execute("DELETE FROM "
                            + DatabaseCreator.TEST_TABLE1 + " WHERE id=" + id);
}
}
