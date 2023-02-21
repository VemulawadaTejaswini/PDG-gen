public class A{
	//...
	public static void main(){
		PrinterJob printJob = PrinterJob.getPrinterJob();
		PageFormat format = printJob.pageDialog(printJob.defaultPage());
	}
}