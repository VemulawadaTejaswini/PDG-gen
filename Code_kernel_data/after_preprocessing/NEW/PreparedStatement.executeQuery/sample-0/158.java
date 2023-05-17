//158
public class func{
public void getInt(Connection connection,String queryString,String[] args){
  for( int i = 0; i < args.length; ++i )
    {
    pStatement.setString( i + 1, args[ i ] );
    }
ResultSet resultSet = pStatement.executeQuery();
resultSet.next();
return resultSet.getInt( 1 );
}
}
