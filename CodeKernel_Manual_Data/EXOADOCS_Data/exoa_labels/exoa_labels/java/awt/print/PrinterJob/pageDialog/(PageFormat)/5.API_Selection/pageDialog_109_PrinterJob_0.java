public class A{
	public PageFormat pageDialog(PrintRequestAttributeSet attributes)throws HeadlessException {

		if (attributes == null) {
			throw new NullPointerException("attributes");
		}
		return pageDialog(defaultPage());
	}
}