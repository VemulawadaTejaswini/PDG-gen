public class func{
public void MySqlClient(String hostport,String user,String pass){
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();
            stmt.execute("create table data(transaction_id bigint PRIMARY KEY AUTO_INCREMENT, content TEXT);");
}
}
