public class func{
public void initFullText(Statement stat,boolean lucene){
        stat.execute("CALL " + prefix + "_INIT()");
}
}
