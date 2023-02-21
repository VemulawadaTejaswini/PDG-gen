public class A{
	public void setCurrentPage(int newPage) {
		if ( pages == null ) return;
		if ( currentPage != null ) {
			pnlCurrentPageContainer.remove(currentPage);
			currentPage.setVisible(false);
		}
		currentPage   = pages[newPage];
		currentPageNo = newPage;
		if( currentPage != null ) {
			currentPage.setVisible(true);
			pnlCurrentPageContainer.add(currentPage);
		}
		pack();
		update(getGraphics());
		updateControlState();
	}
}