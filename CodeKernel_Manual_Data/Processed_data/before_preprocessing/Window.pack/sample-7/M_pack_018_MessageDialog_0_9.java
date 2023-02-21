public class A{
	protected int build_message(String title, String message, boolean mode) {
		
		setModal( mode );
		setTitle( title );
		
		int      i,n,m;
		Label    l;
		TextArea t;
		StringTokenizer st;
		String s;
		
		if (message == null)message = "";
		answer = -1;
		setLayout( new BorderLayout() );
		msg = new Panel();
		
		v  = new Vector();
		st = new StringTokenizer(message,"\n");
		n  = st.countTokens();
		m  = -1;
		while (st.hasMoreTokens()) {
			s = st.nextToken();
			if (s.length() > m)m = s.length();
		}
		if (useMultiLabels) {
			msg.setLayout(new GridLayout(n+2,1));
			msg.add(new Label(" "));
			for (i=0; i<n; i++) {
				l = new Label();
				v.addElement(l);
				msg.add(l);
			}
		} else {
			msg.setLayout( new BorderLayout() );
			n = (n >  20) ?  20 : ((n <  1) ?  1 : n);
			m = (m > 100) ? 100 : ((m < 30) ? 30 : m);
			if (trows == -1)trows = n;
			if (tcols == -1)tcols = m;
			t = new TextArea( trows, tcols );
			t.setEditable( editableArea );
			v.addElement(t);
			msg.add( t, BorderLayout.CENTER );
		}
		
		add( msg, BorderLayout.CENTER);
		
		buttons = new Panel();
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		if (b1 != null) {
			buttons.add(b1);
		}
		
		if (b2 != null)buttons.add(b2);

		if (b3 != null)buttons.add(b3);

		add( buttons, BorderLayout.SOUTH);
		setMessage(message);
		
		addListeners();
		
		pack();
		center();
		
		if (cursorAreaEnd && !useMultiLabels) {
			try {
				((TextArea)v.elementAt(0)).setCaretPosition(((TextArea)v.elementAt(0)).getText().length());
				Debug.printException(this, e);
			}
		}
		
		setVisible( true );
		
		if (!waitF) {
			return 0;
		}
		
		while (isShowing()) {
			try {
				Thread.yield();
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
			}
		}
		removeListeners();
		return answer;
	}
}