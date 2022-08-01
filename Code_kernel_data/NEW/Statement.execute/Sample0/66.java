//65
public class func{
	public void waitForPostCommit(Statement stmt){
        stmt.execute("CALL WAIT_FOR_POST_COMMIT()");
}
}
