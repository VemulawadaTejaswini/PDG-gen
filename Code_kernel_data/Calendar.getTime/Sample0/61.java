//60
public class func{
	public void getDataHoje(){
    Calendar dataHoje = Calendar.getInstance();
    dataHoje.set(Calendar.MILLISECOND, 0);
    return dataHoje.getTime();
}
}
