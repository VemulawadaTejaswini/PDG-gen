//0
public class func{
public void dateRangeChanged(Calendar start,Calendar end){
            if (start == null || end == null) {
               System.err.println("Null range selected");
            } else {
               System.err.println("Range selected, from " + start.getTime() + " to " + end.getTime());
            }
}
}
