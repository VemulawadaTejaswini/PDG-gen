//126
public class func{
	public void format(Environment env,Memory... args){
        WrapTime time = args[0].toObject(WrapTime.class);
        DateFormat df = getDateFormat(time);
        return StringMemory.valueOf(df.format(time.date));
}
}
