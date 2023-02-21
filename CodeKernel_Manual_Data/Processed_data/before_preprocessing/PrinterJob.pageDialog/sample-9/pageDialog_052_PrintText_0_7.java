public class A{
	public void run(){
		lnr = new LineNumberReader(new StringReader (text));
		
		PrinterJob printJob = PrinterJob.getPrinterJob();
		
		PageFormat pageFormat = printJob.pageDialog(new PageFormat());
		
		printJob.setPrintable(this, pageFormat);
		
		if (printJob.printDialog()){
			try{
				printJob.print();
			}
			catch (Exception PrintException){
				PrintException.printStackTrace();
			}
		}
	}
}