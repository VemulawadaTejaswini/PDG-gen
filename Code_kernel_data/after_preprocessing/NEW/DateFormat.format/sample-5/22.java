//22
public class func{
public void getFilteredPartitions(String tableName,String timeZone,String dateMask,Pair<Date,Date> range){
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        String filter = "ds < '" + dateFormat.format(range.first) + "'";
        return client.listPartitionsByFilter(DATABASE_NAME, tableName, filter);
}
}
