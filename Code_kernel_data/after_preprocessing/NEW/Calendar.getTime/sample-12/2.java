//2
public class func{
public void visit(TimeValue value){
                Calendar c = new GregorianCalendar(
                        ((int)value.getYear()), value.getMonth()-1, value.getDay(),
                        value.getHour(), value.getMinute(), value.getSecond());
                return new WikidataValue(
                        WikidataValue.Type.TIME,
                        c.getTime(),
                        jsonValue
                );
}
}
