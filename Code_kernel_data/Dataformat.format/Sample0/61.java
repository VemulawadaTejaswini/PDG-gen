//60
public class func{
	public void toSummary(Context context,long param){
        return String.format(context.getString(R.string.recur_stops_on_date_summary), df.format(new Date(param)));
}
}
