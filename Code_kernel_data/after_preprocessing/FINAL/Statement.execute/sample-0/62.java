public class func{
public void call(){
                    Statement stmt = _conn.createStatement();
                    stmt.execute("SELECT pg_sleep(" + SLEEP_SECONDS + ")");
}
}
