//52
public class func{
public void execute(PageContext pc,Statement stat,boolean createGeneratedKeys,SQL sql){
    return createGeneratedKeys?stat.execute(sql.getSQLString(),Statement.RETURN_GENERATED_KEYS):stat.execute(sql.getSQLString());
}
}
