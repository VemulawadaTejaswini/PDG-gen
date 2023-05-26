public class func{
public void setExpiresAt(Date expiresAt){
            Calendar thirtyMinFromNow = Calendar.getInstance();
            thirtyMinFromNow.add(Calendar.MINUTE, 30);
            expiresAt = thirtyMinFromNow.getTime();
}
}
