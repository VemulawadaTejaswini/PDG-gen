//36
public class func{
	public void getElementDate(PostDetail post){
    calElement.setTime(post.getPublication().getCreationDate());
    calElement.add(Calendar.HOUR_OF_DAY, 0);
    return calElement.getTime();
}
}
