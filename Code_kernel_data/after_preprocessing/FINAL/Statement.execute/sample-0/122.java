public class func{
public void execute(PageContext pc,Statement stat,String sql){
    if(pc==null) return stat.execute(sql);
}
}
