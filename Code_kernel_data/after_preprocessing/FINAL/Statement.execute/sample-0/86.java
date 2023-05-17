public class func{
public void clear(){
            Statement statement = persistenceManager.getConnection().createStatement();
            statement.execute(query);
}
}
