public class func{
public void toString(){
        mb.append("lastAccessedTime", lastAccessedTime <= 0 ? "n/a" : fmt.format(new Date(lastAccessedTime)));
        mb.append("maxInactiveInterval", maxInactiveInterval);
}
}
