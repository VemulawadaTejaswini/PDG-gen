public class func{
public void appendTimeStamp(SpannableStringBuilder buf,Date date){
        DateFormat format = new SimpleDateFormat(mResources.getString(R.string.time_stamp));
        String dateStr = format.format(date);
        SpannableString spanText = new SpannableString(dateStr);
        int len = spanText.length();
}
}
