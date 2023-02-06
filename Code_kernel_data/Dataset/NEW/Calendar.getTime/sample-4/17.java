//17
public class func{
public void toBytes(final Calendar obj){
        if (obj == null) {
            date = null;
        } else {
            date = obj.getTime();
        }
        return DateSerde.get.toBytes(date);
}
}
