public class A{
	public void setupPrinting() {
		PrinterJob pj = PrinterJob.getPrinterJob() ;
		pj.setPageable(this) ;
		my_pf = pj.pageDialog(my_pf) ;
		calculate() ;
	}
}