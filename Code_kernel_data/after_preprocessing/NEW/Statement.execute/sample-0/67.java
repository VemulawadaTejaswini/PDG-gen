//67
public class func{
public void enableXplainStyleWithTiming(Statement s){
        enableXplainStyle(s);
        s.execute("call syscs_util.syscs_set_statistics_timing(1)");
}
}
