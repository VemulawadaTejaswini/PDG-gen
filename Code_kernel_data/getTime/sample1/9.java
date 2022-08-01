//8
public class func{
	public void title(final int cell){
        final Calendar d = (Calendar) date.clone();
        d.add(Calendar.DAY_OF_WEEK, cell);
        final String displayName = dayFormat.format(d.getTime()) + " " + d.get(Calendar.DAY_OF_MONTH) + " " + monthFormat.format(d.getTime());
}
}
