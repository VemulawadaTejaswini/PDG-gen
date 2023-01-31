//66
public class func{
	public void TimeDateTester(String nameOfTest,int year,int month,int date,int hrs,int min,int sec,int nano){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MILLISECOND, nano / 1000000);
        utilDate = c.getTime();
}
}
