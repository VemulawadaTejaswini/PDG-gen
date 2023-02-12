public class func{
public void computeExpiry(){
        if (approvalExpiryInMillis == -1) { // use default of 1 month
            expiresAt.add(Calendar.MONTH, 1);
        }
        else {
            expiresAt.add(Calendar.MILLISECOND, approvalExpiryInMillis);
        }
        return expiresAt.getTime();
}
}
