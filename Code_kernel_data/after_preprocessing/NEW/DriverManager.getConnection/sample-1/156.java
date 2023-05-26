//156
public class func{
public void main(String[] args){
    Connection con = DriverManager.getConnection("jdbc:hive2://xd-hive.xdata.data-tactics-corp.com:10000/default", "", "");
    Statement stmt = con.createStatement();
    ResultSet res = stmt.executeQuery(sql);
}
}
