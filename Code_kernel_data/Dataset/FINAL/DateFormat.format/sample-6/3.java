public class func{
public void print(Date time){
    DateFormat p = DateFormat.getDateInstance(DateFormat.FULL);
    log("Local Date is " + p.format(time));
}
}
