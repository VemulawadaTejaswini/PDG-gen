public class func{
public void executeCanonicalizedSQL(Statement mS,String statement){
      statement = statement.replace(" clob,", " text,");
    return mS.execute(statement);
}
}
