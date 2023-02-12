public class func{
public void dateChanged(Calendar date){
            if (date != null) {
               System.err.println(date.getTime().toString());
            } else {
               System.err.println("null");
            }
}
}
