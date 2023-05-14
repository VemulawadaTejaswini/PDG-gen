public class A{
	public void actionPerformed(ActionEvent event){
		PrinterJob job = PrinterJob.getPrinterJob();
		PageFormat newPageFormat = job.pageDialog(attributes);
		if (newPageFormat != null)pageFormat = newPageFormat;
		canvas.repaint();
	}
}