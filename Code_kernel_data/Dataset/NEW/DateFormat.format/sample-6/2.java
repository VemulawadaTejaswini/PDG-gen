//2
public class func{
public void localizedOutputOfDates(){
    Locale localeJA = new Locale("ja"); // Japan
    DateFormat dateformatJA = DateFormat.getDateInstance(DateFormat.FULL, localeJA);
    assertEquals(dateformatJA.format(date), __);
}
}
