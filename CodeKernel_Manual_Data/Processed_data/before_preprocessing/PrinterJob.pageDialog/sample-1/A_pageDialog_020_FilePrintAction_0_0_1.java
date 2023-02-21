public class A{
	//...
	public static void main(){
		PrinterJob job = PrinterJob.getPrinterJob();
		PageFormat pf = job.pageDialog(job.defaultPage());
	}
}