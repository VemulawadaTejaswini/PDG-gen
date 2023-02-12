public class func{
public void addUserToDatabase(String current_id,String ca_Name){
      Statement st = connection.createStatement();
      st.execute("INSERT into users (facebook_id,ca_id) values ("+current_id +",'"+ca_Name+"') " +
          "on duplicate key update ca_id='"+ca_Name+"';");
}
}
