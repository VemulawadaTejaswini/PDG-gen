//50
public class func{
	public void time(){
    Long t = Long.parseLong( String.valueOf(this.datapoint.get("time")) );
    String time = dfm.format( t * 1000 );
}
}
