public class func{
public void updateSummary(final long time){
    final Date date = new Date(time);
    setSummary(dateFormat.format(date.getTime()));
}
}
