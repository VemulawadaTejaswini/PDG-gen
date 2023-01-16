//83
public class func{
	public void add(int field,Date date,int value){
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    int fieldNewValue = (c.get(field) + value);
    c.set(field, fieldNewValue);
    return c.getTime();
}
}
