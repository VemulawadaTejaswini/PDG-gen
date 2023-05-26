public class func{
public void clearXplainOnlyMode(Statement s){
        s.execute("call syscs_util.syscs_set_xplain_mode(0)");
}
}
