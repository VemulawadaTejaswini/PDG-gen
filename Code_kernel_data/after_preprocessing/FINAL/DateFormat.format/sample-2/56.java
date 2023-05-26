public class func{
public void getCurrentDate(){
        DateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMATTER);
        String formattedDate = formatter.format(now);
        return formattedDate.replace("-", ".");
}
}
