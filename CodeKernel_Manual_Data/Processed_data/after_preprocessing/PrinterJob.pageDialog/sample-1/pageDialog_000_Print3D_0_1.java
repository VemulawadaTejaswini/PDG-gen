public class A{
	public void run(){
		PrinterJob printerJob =PrinterJob.getPrinterJob();
		PageFormat pageFormat =printerJob.pageDialog(printerJob.defaultPage());
		printerJob.setPrintable(c3d, pageFormat);
		try {
			if( printerJob.printDialog()) printerJob.print();
		} catch ( Exception e) { e.printStackTrace(); }
	}
}