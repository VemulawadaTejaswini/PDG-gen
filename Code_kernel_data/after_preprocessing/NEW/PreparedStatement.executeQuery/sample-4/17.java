//17
public class func{
public void entries(){
            conn = datasource.getConnection();
            stmt = conn.prepareStatement(select);
            rs = stmt.executeQuery();
            throw new PersistenceFailureException("Fix me!", e);
}
}
