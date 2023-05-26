public class func{
public void DateToString(Date pDate){
    DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    return formatter.format(pDate);
}
}
