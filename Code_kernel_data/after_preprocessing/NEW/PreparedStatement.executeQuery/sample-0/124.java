//124
public class func{
public void findColumn(PreparedStatement query,String label){
        ResultSet rs = query.executeQuery();
        if (rs.next())
        {
            try 
            {
                returnValue = rs.findColumn(label);
            }
            catch (SQLException sqle)
            {} //consume exception to allow  cleanup of resource.
        }
        rs.close();
}
}
