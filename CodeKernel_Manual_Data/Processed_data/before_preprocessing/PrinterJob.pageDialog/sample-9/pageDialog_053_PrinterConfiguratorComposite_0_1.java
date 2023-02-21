public class A{
	public void widgetSelected(SelectionEvent arg0) {
		PrinterJob printerJob = getPrinterJob();
		PageFormat newPageFormat;
		if (PrinterConfiguratorComposite.this.pageFormat != null)newPageFormat = printerJob.pageDialog(PrinterConfiguratorComposite.this.pageFormat);
		elsenewPageFormat = printerJob.pageDialog(printerJob.defaultPage());
		PrinterConfiguratorComposite.this.pageFormat = newPageFormat;
		pageFormatDescription.setText(getPageFormatDescription(PrinterConfiguratorComposite.this.pageFormat));
		if (pageSetupComposite != null)pageSetupComposite.refresh(PrinterConfiguratorComposite.this.pageFormat);
	}
}