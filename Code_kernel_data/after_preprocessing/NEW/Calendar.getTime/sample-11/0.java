//0
public class func{
public void matches(Object object){
                if (object instanceof Calendar) {
                    Calendar c = (Calendar) object;
                    String actual = new SimpleDateFormat(format).format(c.getTime());
                    return value.equals(actual);
                }
}
}
