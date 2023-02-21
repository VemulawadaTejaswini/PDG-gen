public class A{
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed on print button");
		
		shopListDoc = shopList.getDocument();
		if(shopListDoc != null) {
			PrintItem pItem = new PrintItem(shopListDoc);
			
			PrinterJob printJob = PrinterJob.getPrinterJob();
			printJob.setPrintable(pItem);
			
			PageFormat pf = printJob.pageDialog(printJob.defaultPage());
			
			if(printJob.printDialog()){
				try {
					printJob.print();
				} catch (Exception PrintException) {}
			}
		}
	}
}