public class func{
public void buildCommonFormatDate(RequestData requestData,Date date){
        DateFormat dateFormat = requestUtil.getCommonFormatDate(requestData, DateFormat.MEDIUM, DateFormat.MEDIUM);
        return dateFormat.format(date);
}
}
