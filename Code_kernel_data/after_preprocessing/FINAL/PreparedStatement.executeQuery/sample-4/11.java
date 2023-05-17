public class func{
public void executeQuery(Connection conn,String query){
        PreparedStatement st = conn.prepareStatement(query);
        st.executeQuery();
}
}
