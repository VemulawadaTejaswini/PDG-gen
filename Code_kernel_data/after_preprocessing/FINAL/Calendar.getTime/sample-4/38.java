public class func{
public void setBeginDate(Calendar beginDate){
        if (beginDate != null) {
            this.setBegin(beginDate.getTime());
        } else {
            this.setBegin(null);
        }
}
}
