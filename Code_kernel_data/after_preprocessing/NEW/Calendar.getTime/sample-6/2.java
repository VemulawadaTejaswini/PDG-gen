//2
public class func{
public void roleEnvironmentSetStateSetsState(){
        Calendar exp = Calendar.getInstance(TimeZone.getTimeZone("GMT+0:00"));
        exp.add(Calendar.MINUTE, 1);
        RoleEnvironment.setStatus(RoleInstanceStatus.Ready, exp.getTime());
}
}
