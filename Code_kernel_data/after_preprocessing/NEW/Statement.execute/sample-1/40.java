//40
public class func{
public void cleanup(){
        Statement dropStmt = this.conn.createStatement();
        dropStmt.execute("DROP TABLE actor_states");
        dropStmt.close();
}
}
