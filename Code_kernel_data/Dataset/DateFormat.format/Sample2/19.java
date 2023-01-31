//18
public class func{
	public void formatDate(Date messageDate){
        DateFormat formatter = new SimpleDateFormat("MMM dd, yyyy 'at' hh:mm a");
        return formatter.format(messageDate);
}
}
