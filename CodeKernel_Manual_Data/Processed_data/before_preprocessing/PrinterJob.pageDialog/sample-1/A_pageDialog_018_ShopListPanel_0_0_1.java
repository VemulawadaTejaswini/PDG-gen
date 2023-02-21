public class A{
	//...
	public static void main(){
		PrinterJob printJob = PrinterJob.getPrinterJob();
		//...
		PageFormat pf = printJob.pageDialog(printJob.defaultPage());
	}
}