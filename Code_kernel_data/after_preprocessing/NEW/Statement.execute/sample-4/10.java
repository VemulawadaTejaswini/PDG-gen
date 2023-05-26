//10
public class func{
public void addSumforWeekAndProfile(int week,int profile,int sum){
      Statement st = connection.createStatement();
      st.execute("INSERT into total_info (week,profile,number_actions) values ("+week +","+profile+","+sum+") " +
          "on duplicate key update number_actions="+sum+";");
      logger.debug("error while adding sum into total info for week "+week+" , profile "+profile+" Reason: "+e);
      e.printStackTrace();
}
}
