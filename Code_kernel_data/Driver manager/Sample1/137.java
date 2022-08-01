//136
public class func{
	public void accessDataBase(){
      Connection con = DriverManager
          .getConnection("jdbc:sqlite:stodoitem");
      Statement stat = con.createStatement();
      ResultSet rs = stat.executeQuery(sql);
      parse(rs);
      con.close();
}
}
