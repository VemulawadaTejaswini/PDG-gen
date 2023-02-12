public class func{
public void localizedOutputOfDates(){
    Locale localeBR = new Locale("pt","BR"); // portuguese, Brazil
    DateFormat dateformatBR = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
    assertEquals(dateformatBR.format(date), __);
}
}
