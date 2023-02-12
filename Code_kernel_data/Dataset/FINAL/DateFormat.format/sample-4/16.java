public class func{
public void toString(){
            DateFormat df=DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, HBCIUtils.getLocale());
            ret.append("Depot ").append(depot.toString()).append(" ").append(df.format(timestamp)).append(linesep);
}
}
