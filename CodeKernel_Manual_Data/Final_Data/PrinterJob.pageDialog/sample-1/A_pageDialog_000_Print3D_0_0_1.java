public class A{
	//...
	public static void main(){
		PrinterJob printerJob =PrinterJob.getPrinterJob();
		PageFormat pageFormat =printerJob.pageDialog(printerJob.defaultPage());
	}
}