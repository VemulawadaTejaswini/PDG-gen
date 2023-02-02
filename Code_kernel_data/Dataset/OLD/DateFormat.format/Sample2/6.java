//5
public class func{
	public void getDate(Date created_at){
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return sdf.format(created_at);
}
}
