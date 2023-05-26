public class func{
public void getScheduleString(){
        sb.append(dfDate.format(this.getStart()));
        sb.append(" @ ");
        sb.append(dfTime.format(this.getStart()));
        return sb.toString();
}
}
