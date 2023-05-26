public class func{
public void enableRuntimeStatistics(Statement s){
        s.execute("call syscs_util.syscs_set_runtimestatistics(1)");
}
}
