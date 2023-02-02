//119
public class func{
public void waitForServerToBack(){
                HttpURLConnection con = (HttpURLConnection)new URL(hudsonUrl,"tcpSlaveAgentListener/").openConnection();
                con.connect();
                if(con.getResponseCode()==200)
                    return;
}
}
