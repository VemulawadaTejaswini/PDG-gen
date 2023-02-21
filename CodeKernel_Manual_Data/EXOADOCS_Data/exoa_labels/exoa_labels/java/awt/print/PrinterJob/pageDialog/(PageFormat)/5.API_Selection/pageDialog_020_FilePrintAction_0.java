public class A{
	public void actionPerformed(ActionEvent ae) {
		EditorWindow win = (EditorWindow)MainWindow.getInstance().getWindowPanel().getSelectedFrame();
		if (win == null) {
			MainWindow.getInstance().error(TextManager.getProperty("other.nowindow.error","Please select a workspace."));
		} else {
			try {
				PrinterJob job = PrinterJob.getPrinterJob();
				PageFormat pf = job.pageDialog(job.defaultPage());
				job.setPageable(win.getEditor().getBookToPrint(pf));
				job.print();
			} catch (Exception ex) {
				MainWindow.getInstance().error(TextManager.getProperty("other.error.printing","An error occured while trying to print your Turing machine."));
			}
		}
	}
}