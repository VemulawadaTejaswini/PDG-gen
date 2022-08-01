//37
public class func{
	public void queryMore(final AbstractTsiProvider provider,final boolean later){
      c.add(Calendar.MINUTE, later ? 1 : -1);
      return provider.queryTripsFromContext(this, c.getTime(), later);
}
}
