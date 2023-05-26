public class func{
public void convert(Object src,Class destClass){
            if (Calendar.class.isInstance(src)) {
                Calendar ca = (Calendar) src;
                return new DateDayToString().convert(ca.getTime(), String.class);
            }
}
}
