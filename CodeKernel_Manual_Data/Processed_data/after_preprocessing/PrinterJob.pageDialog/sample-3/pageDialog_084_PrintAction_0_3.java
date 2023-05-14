public class A{
	public void doPageSetup() {
		setPageFormat(getPrinterJob().pageDialog(getPageFormat()));
	}
}