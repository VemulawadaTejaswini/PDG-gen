//2
public class func{
public void convert(Object src,Class destClass){
            if (Calendar.class.isInstance(src)) { // å¿…é¡»æ˜¯Calendar
                Calendar ca = (Calendar) src;
                return new DateDayToString().convert(ca.getTime(), String.class);
            }
}
}
