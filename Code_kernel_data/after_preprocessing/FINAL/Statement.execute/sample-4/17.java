public class func{
public void deleteUserFromDatabase(String current_id){
      Statement st = connection.createStatement();
      st.execute("Delete from users where facebook_id ="+current_id +";");
}
}
