public class A{
	//...
	public static void main(){
		PrinterJob printerJob = getPrinterJob();
		//...
		elsenewPageFormat = printerJob.pageDialog(printerJob.defaultPage());
	}
}