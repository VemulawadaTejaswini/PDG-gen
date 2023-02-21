public class A{
	private void initSearchDialog() {
		getContentPane().add(searchPanel);
		searchPanel.criteriaPanel.fldSearchField.grabFocus();
		getRootPane().setDefaultButton(searchPanel.criteriaPanel.btnFind);
		getRootPane().registerKeyboardAction(CANCEL_ACTION, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
		pack();
		Point newPoint = SwingUtils.getCenteredWindowPoint(this);
		setLocation(newPoint);
		searchPanel.criteriaPanel.btnFind.setAction(FIND_ACTION);
		searchPanel.btnCancel.setAction(CANCEL_ACTION);
		searchPanel.btnOk.setAction(OK_ACTION);
		setItemLevelActionsEnabled(false);
		getResultsTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
	}
}