public class A{
	public void createChartPrintJob(){
		PrinterJob job = PrinterJob.getPrinterJob();
		PageFormat pf = job.defaultPage();
		PageFormat pf2 = job.pageDialog(pf);
		if (pf2 != pf){
			job.setPrintable(this, pf2);
			if (job.printDialog()){
				try{
					job.print();
				}
				catch (PrinterException e){
					JOptionPane.showMessageDialog(this, e);
				}
			}
		}
	}
}