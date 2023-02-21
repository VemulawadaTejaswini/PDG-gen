public class A{
	public void actionPerformed(ActionEvent e){
		if (owner.getGraph() != null){
			try{
				PageFormat f = PrinterJob.getPrinterJob().pageDialog(owner.getGraph().getPageFormat());
				owner.getGraph().setPageFormat(f);
			}
			catch (Exception ex){
				Trace.error(getClass(), "actionPerformed()", ex.getMessage());
			}
		}
	}
}