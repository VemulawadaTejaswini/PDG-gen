public class func{
public void getNotBefore(){
        NativeCrypto.ASN1_TIME_to_Calendar(NativeCrypto.X509_get_notBefore(mContext), calendar);
        return calendar.getTime();
}
}
