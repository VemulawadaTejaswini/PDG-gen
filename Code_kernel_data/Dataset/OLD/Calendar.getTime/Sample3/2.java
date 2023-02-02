//1
public class func{
	public void computeExpiry(){
    if (approvalExpirySeconds == -1) { // use default of 1 month
      expiresAt.add(Calendar.MONTH, 1);
    }
    else {
      expiresAt.add(Calendar.SECOND, approvalExpirySeconds);
    }
    return expiresAt.getTime();
}
}
