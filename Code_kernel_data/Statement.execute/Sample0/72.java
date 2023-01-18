//71
public class func{
	public void checkPoint(){
            st = createStatement();
            st.execute("CALL SYSCS_UTIL.SYSCS_CHECKPOINT_DATABASE()");
}
}
