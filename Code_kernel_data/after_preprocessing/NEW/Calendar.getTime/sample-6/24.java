//24
public class func{
public void doJob(){
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.MONTH, -1);
    List<Registration> registrations = Registration.find("createdAt < ", cal.getTime()).fetch();
    for (Registration registration : registrations) {
      registration.delete();
    }
    Logger.info("Deleted %s stale registrations", registrations.size());
}
}
