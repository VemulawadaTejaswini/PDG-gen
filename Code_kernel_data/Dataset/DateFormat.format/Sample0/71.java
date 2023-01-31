//70
public class func{
	public void getReadableDate(long dateInSeconds){
        return dateFormatter.format(new Date(dateInSeconds * 1000));
}
}
