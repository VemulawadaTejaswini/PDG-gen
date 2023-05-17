//17
public class func{
public void getDueDate(Media media){
    c.add(Calendar.DAY_OF_YEAR, media.howManyDaysThisCanBeBorrowed());
    return c.getTime();
}
}
