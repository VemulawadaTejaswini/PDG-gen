public class func{
public void validateDate(Date date){
        calendar.set(1753, 01, 01);
        if(date != null && date.before(calendar.getTime()) ){
            validated = false;
        }
}
}
