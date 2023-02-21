public class A{
	public void setText( String text ) {
		dtext = text;
		LineLabel infoLabel;
		String line;
		removeAll();
		int idx1, idx2;
		idx1 = 0;
		while ( idx1 < text.length() ) {
			idx2 = text.indexOf( '\n', idx1 );
			if (idx2>=0) {
				line = text.substring( idx1, idx2 );
				idx1 = idx2+1;
			} else {
				line = text.substring( idx1 );
				idx1 = text.length();
			}
			infoLabel = new LineLabel( line );
			add(  "", infoLabel );
		}
		pack();
	}
}