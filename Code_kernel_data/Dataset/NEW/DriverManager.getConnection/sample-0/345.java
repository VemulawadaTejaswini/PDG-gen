//345
public class func{
public void DbAdapter(){
    mConn = DriverManager.getConnection("jdbc:sqlite:assets/pokemon.db");
    mStat = mConn.createStatement();
}
}
