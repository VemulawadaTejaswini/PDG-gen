public class A{
	public static void main(){
		PrinterJob job = PrinterJob.getPrinterJob();
		PageFormat defaultFormat = job.defaultPage();
		PageFormat selectedFormat = job.pageDialog(defaultFormat);
	}
}