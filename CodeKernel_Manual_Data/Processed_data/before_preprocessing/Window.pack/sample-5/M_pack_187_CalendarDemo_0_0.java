public class A{
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;
		
		jPanel1 = new javax.swing.JPanel();
		bPlain = new javax.swing.JButton();
		bHoliDay = new javax.swing.JButton();
		bTasks = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		bExit = new javax.swing.JButton();
		
		FormListener formListener = new FormListener();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("CalendarDemo");
		addWindowListener(formListener);
		
		jPanel1.setLayout(new java.awt.GridBagLayout());
		
		jPanel1.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(20, 20, 20, 20)));
		bPlain.setText("Plain Calendar");
		bPlain.addActionListener(formListener);
		
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(bPlain, gridBagConstraints);
		
		bHoliDay.setText("HoliDay Calendar");
		bHoliDay.addActionListener(formListener);
		
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(bHoliDay, gridBagConstraints);
		
		bTasks.setText("Tasks Calendar");
		bTasks.addActionListener(formListener);
		
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(bTasks, gridBagConstraints);
		
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(jSeparator1, gridBagConstraints);
		
		bExit.setText("Exit");
		bExit.addActionListener(formListener);
		
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(bExit, gridBagConstraints);
		
		getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
		
		pack();
	}
}