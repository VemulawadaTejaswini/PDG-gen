//150
public class func{
public void execute(String query){
      s = getSQLConnection().createStatement();
      s.execute(query);
}
}
