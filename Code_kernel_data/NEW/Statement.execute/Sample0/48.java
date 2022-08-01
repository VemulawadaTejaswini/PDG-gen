//47
public class func{
	public void dropAllTriggerPlans(){
        Statement s = createStatement();
                + getClass().getName()
        s.execute("drop procedure clear_sps_plans");
}
}
