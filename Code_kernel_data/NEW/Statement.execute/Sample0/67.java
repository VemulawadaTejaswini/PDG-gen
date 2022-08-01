//66
public class func{
	public void enableXplainOnlyMode(Statement s){
        s.execute("call syscs_util.syscs_set_xplain_mode(1)");
}
}
