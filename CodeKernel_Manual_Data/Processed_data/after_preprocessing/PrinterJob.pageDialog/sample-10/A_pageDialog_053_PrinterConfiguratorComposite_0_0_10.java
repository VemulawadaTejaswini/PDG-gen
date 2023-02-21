public class A{
	public static void main(){
		PrinterJob printerJob = getPrinterJob();
		if (PrinterConfiguratorComposite.this.pageFormat != null)newPageFormat = printerJob.pageDialog(PrinterConfiguratorComposite.this.pageFormat);
	}
}