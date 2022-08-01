//23
public class func{
	public void setTimeout(long t){
        Statement stm = createStatement();
        stm.execute("call syscs_util.syscs_set_database_property(" +
                    "'derby.locks.waitTimeout', '" + t + "')");
        stm.close();
}
}
