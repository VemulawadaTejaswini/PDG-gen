//351
public class func{
public void getMasterConnection(){
            String url = masterURL(replicatedDb);
            masterConn = DriverManager.getConnection(url);
}
}
