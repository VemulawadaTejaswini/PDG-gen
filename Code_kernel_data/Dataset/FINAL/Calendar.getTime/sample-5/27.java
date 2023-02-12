public class func{
public void checkDate(String dateToParse,Date desiredDate){
    String checkedDate = sdf.format( cal.getTime() );
    return checkedDate.equalsIgnoreCase( dateToParse );
}
}
