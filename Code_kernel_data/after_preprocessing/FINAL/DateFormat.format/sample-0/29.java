public class func{
public void printDate(StringBuilder sb,String addedBy){
        Date date = new Date();
        sb.append("# Added by dctc "
                  + addedBy
                  + " ("
                  + dateFormat.format(date)
                  + ").");
}
}
