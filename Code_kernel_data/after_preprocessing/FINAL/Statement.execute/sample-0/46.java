public class func{
public void dropTrigger(Statement s,String launchId){
    String triggerName = launchId.replace(" ", "_");
    triggerName = triggerName.replace(".", "_");
    triggerName = triggerName.toUpperCase();
      s.execute("DROP TRIGGER " + triggerName);
}
}
