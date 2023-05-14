public class A{
	public static void main(){
		PrinterJob job = PrinterJob.getPrinterJob();
		PageFormat newPageFormat = job.pageDialog(attributes);
	}
}