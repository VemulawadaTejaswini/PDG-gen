//10
public class func{
	public void main(String[] args){
        String siString = new String (dfSi.format(new Date(108, Calendar.APRIL, 30)));
        if (expected.compareTo(siString) != 0) {
            throw new RuntimeException("Error: " + siString  + " should be " + expected);
        }
}
}
