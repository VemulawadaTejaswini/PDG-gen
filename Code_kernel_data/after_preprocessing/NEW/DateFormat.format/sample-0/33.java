//33
public class func{
public void setMessage(JSONObject event,String displayName,Cursor cursor){
            String dateString = df.format(new Date(date));
            event.put("message", getString(R.string.missed_call_at, dateString));
}
}
