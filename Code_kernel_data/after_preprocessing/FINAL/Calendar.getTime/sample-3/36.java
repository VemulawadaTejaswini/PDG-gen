public class func{
public void createUTCDate(final int year,final int dayOfYear,final int millisInDay){
        final Calendar calendar = ProductData.UTC.createCalendar();
        calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
        calendar.add(Calendar.MILLISECOND, millisInDay);
        return ProductData.UTC.create(calendar.getTime(), 0);
}
}
