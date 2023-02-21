public class A{
	public synchronized void performAction() {
		PrinterJob pj = PrinterJob.getPrinterJob();
		PrintPreferences.setPageFormat(pj.pageDialog(PrintPreferences.getPageFormat(pj)));
	}
}