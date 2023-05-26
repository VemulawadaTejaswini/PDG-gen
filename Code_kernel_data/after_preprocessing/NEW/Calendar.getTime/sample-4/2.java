//2
public class func{
public void toString(Object object){
        Calendar calendar = (Calendar) object;
        if (calendar == null)
        {
            return null;
        }
        return String.valueOf(calendar.getTime().getTime());
}
}
