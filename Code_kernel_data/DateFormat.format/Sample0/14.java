//13
public class func{
	public void printStats(){
        System.out.println("Elapsed  : " + df.format(new Date(elapsed)));
        System.out.println("Kbps     : " + String.format(Locale.US, "%.2f", kbytes * 8.0 / elapsedSecs));
}
}
