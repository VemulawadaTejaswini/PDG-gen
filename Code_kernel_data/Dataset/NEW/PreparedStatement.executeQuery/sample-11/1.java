//1
public class func{
public void execute(String query,Object... params){
    for (int index = 0; index < params.length; index++) {
      preparedStatement.setObject(index + 1, params[index]);
    }
    return preparedStatement.executeQuery();
}
}
