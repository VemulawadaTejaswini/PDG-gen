//31
public class func{
	public void dateadd(String part,int count,Timestamp d){
        int nanos = d.getNanos() % 1000000;
        calendar.setTime(d);
        calendar.add(field, count);
        long t = calendar.getTime().getTime();
        Timestamp ts = new Timestamp(t);
        ts.setNanos(ts.getNanos() + nanos);
}
}
