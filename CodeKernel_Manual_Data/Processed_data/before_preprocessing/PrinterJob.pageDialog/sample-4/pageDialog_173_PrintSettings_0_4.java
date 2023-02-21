public class A{
	public java.awt.Component getCustomEditor() {
		PageFormat pf = (PageFormat) getValue();
		PrinterJob pj = PrinterJob.getPrinterJob();
		PageFormat npf = pj.pageDialog(pf);
		
		((PrintSettings)PrintSettings.findObject(PrintSettings.class)).setPageFormat((PageFormat) npf.clone());
		pj.cancel();
		
		return null;
	}
}