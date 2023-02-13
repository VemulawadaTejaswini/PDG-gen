public class func{
public void computeExpiry(){
    if (approvalExpirySeconds == -1) {
      expiresAt.add(Calendar.MONTH, 1);
    }
    else {
      expiresAt.add(Calendar.SECOND, approvalExpirySeconds);
    }
    return expiresAt.getTime();
}
}
