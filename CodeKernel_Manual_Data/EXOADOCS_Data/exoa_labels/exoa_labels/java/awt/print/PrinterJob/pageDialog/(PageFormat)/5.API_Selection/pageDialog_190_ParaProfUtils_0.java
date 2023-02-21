public class A{
	public static void print(Printable printable) {
		PrinterJob job = PrinterJob.getPrinterJob();
		PageFormat defaultFormat = job.defaultPage();
		PageFormat selectedFormat = job.pageDialog(defaultFormat);
		job.setPrintable(printable, selectedFormat);
		try {
			job.print();
		} catch (PrinterException e) {
			ParaProfUtils.handleException(e);
		}
	}
}