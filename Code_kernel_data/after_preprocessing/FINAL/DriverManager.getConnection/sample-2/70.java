public class func{
public void main(String args[]){
          Connection conn = DriverManager.getConnection
              ("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
          Statement stmt = conn.createStatement();
          ResultSet rset = stmt.executeQuery("select* from belli");
          while (rset.next())
                System.out.println (rset.getString(1));
          stmt.close();
}
}
