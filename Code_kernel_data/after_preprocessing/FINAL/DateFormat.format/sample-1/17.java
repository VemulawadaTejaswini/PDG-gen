public class func{
public void write(OutputNode node,Date date){
        DateFormat tzDf = new SimpleDateFormat("Z");
        String timezone = tzDf.format(date);
        String val = df.format(date) + timezone.substring(0, 3) + ":" + timezone.substring(3);
        node.setValue(val);
}
}
