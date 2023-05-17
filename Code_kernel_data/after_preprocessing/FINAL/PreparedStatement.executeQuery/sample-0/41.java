public class func{
public void select(Connection conn,String key){
        PreparedStatement stmt = conn.prepareStatement(upsert);
            stmt.setString(1, key);
            results = stmt.executeQuery();
            if(results.next())
                return results.getString(1);
            else
                return null;
}
}
