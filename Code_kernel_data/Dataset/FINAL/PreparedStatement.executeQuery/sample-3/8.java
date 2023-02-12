public class func{
public void executeStatement(Statement statement,QueryLimit queryLimit,int splitIndex){
            return ((PreparedStatement) statement).executeQuery();
}
}
