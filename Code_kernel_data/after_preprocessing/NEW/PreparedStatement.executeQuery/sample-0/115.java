//115
public class func{
public void getLatestModificationDate(Connection conn){
            st = conn.prepareStatement("SELECT MAX(mDate) FROM doFields ");
            ResultSet results = st.executeQuery();
            if (results.next()) {
                return results.getLong(1);
            } else {
                return 0L;
            }
}
}
