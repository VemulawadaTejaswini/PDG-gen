public class func{
public void appendToInvocationHistory(String entry){
        invocationHistory.append(dateFormat.format(new Date(clock.currentTimeMillis())));
        invocationHistory.append(entry);
}
}
