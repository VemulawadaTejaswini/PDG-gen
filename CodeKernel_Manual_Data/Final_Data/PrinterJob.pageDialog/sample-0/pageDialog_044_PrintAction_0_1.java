public class A{
	public void doAction(EditorContainer container){
		PrinterJob printJob = PrinterJob.getPrinterJob();
		PageFormat format = printJob.pageDialog(printJob.defaultPage());
		printJob.setPrintable((ConsoleWindow)container, format);
		
		if (printJob.printDialog()) {
			try {
				printJob.print();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}