public class A{
	private void jbInit() throws Exception {
		labelTitle.setAlignment(Label.CENTER);
		labelTitle.setFont(new java.awt.Font("Serif", 3, 16));
		labelTitle.setText("Display");
		this.setVisible(true);
		this.setLayout(borderLayout1);
		buttonOK.setLabel("OK");
		buttonOK.addActionListener(new Orrery_buttonOK_actionAdapter(this));
		textArea1.setColumns(50);
		textArea1.setRows(20);
		textArea1.setText("Planetary Data");
		this.add(labelTitle, BorderLayout.NORTH);
		this.add(panelConsole, BorderLayout.SOUTH);
		panelConsole.add(buttonOK, null);
		this.add(panelDisplay, BorderLayout.CENTER);
		panelDisplay.add(textArea1, null);
		pack();
	}
}