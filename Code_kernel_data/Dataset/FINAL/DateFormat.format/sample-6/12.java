public class func{
public void getLocalizedDate(Timestamp timestamp,int datestyle){
        DateFormat dateformat = DateFormat.getDateInstance(datestyle);
        String localizedDateString = dateformat.format(timestamp);
}
}
