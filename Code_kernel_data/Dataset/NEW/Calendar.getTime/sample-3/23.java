//23
public class func{
public void title(final int cell){
        final Calendar d = (Calendar) date.clone();
        d.add(Calendar.MONTH, cell);
        final String displayName = monthFormat.format(d.getTime()) + " " + d.get(Calendar.YEAR);
}
}
