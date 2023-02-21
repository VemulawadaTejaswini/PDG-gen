public class A{
	private void closeStatements() {
		if (stmts == null) {
			return;
		}
		for(int i=0; i<stmts.length; ++i) {
			if (stmts[i] == null) {
				continue;
			}
			try {
				stmts[i].executeBatch();
				stmts[i].close();
			} catch (SQLException e) {
				m_log.warn("Closing statement", e);
			}
		}
		stmts = new Statement[0];
	}
}