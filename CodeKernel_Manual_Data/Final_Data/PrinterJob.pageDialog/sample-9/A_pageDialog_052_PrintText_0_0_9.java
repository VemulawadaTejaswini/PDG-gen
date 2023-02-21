public class A{
	//...
	public static void main(){
		PrinterJob printJob = PrinterJob.getPrinterJob();
		//...
		PageFormat pageFormat = printJob.pageDialog(new PageFormat());
	}
}