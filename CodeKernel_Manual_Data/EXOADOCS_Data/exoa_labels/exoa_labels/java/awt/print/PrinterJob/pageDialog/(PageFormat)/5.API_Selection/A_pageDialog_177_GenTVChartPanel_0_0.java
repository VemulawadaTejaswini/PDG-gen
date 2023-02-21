public class A{
	//...
	public static void main(){
		PrinterJob job = PrinterJob.getPrinterJob();
		PageFormat pf = job.defaultPage();
		PageFormat pf2 = job.pageDialog(pf);
	}
}