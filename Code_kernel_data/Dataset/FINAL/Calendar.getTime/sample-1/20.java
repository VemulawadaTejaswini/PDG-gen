public class func{
public void context(int elapsedMinutes){
        VerifyContext result = new VerifyContext(new TestContext.Empty(), calendar.getTime());
        calendar.add(Calendar.MINUTE, elapsedMinutes);
        result.setTestFinished(calendar.getTime());
}
}
