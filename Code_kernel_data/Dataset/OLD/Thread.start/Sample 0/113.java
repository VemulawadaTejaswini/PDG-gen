//112
public class func{
	public void main(String[] args){
        Context context = new Context();
        new Thread(new OddPrinter(context)).start();
}
}
