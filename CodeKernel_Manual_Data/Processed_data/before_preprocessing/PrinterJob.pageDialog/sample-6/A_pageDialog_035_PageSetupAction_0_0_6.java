public class A{
	//...
	public static void main(){
		PrinterJob pj = PrinterJob.getPrinterJob();
		PrintPreferences.setPageFormat(pj.pageDialog(PrintPreferences.getPageFormat(pj)));
	}
}