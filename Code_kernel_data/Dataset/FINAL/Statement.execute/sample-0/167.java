public class func{
public void execute(PageContext pc,Statement stat,String sql,int[] columnIndexes){
    if(pc==null) return stat.execute(sql,columnIndexes);
}
}
