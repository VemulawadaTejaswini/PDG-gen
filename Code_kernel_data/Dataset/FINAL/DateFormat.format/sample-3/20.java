public class func{
public void toString(Object o){
            return formatter.format(o instanceof Date ? ((Date) o) : ((Calendar) o).getTime());
}
}
