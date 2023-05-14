public class A{
	public static void main(){
		PageFormat pf = (PageFormat) getValue();
		PrinterJob pj = PrinterJob.getPrinterJob();
		PageFormat npf = pj.pageDialog(pf);
	}
}