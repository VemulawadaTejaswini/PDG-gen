public class A{
	public static void main(String[] args){
		if (args.length == 0){
			System.out.println("FAILED: connection URL must be provided in order to run the demo!");
			return;
		}
		
		String url = args[0];
		StringTokenizer st = new StringTokenizer(url, ":");
		String token;
		String newUrl = "";
		
		for (int i = 0; i < 4; ++i){
			if (!st.hasMoreTokens()){
				System.out.println("FAILED: incorrect URL format!");
				return;
			}
			token = st.nextToken();
			if (newUrl != "")newUrl += ":";
			newUrl += token;
		}
		
		newUrl += "/testDB";
		
		while (st.hasMoreTokens()){
			newUrl += ":" + st.nextToken();
		}
		
		Connection conn = null;
		int        rc;
		String     cmd=null;
		Statement  stmt = null;
		PreparedStatement pstmt = null;
		
		String testName = "Batch Update ";
		
		System.out.println(">>>" + testName + " test.");
		System.out.println("URL = \"" + newUrl + "\"");
		
		try{
			Class.forName("com.informix.jdbc.IfxDriver");
		}
		catch (Exception e){
			System.out.println("FAILED: failed to load Informix JDBC driver.");
		}
		
		try{
			conn = DriverManager.getConnection(newUrl);
		}
		catch (SQLException e){
			System.out.println("FAILED: failed to connect!");
		}
		
		try{
			Statement dstmt = conn.createStatement();
			dstmt.executeUpdate("drop table tab1");
		}
		catch (SQLException e){ ; }

		try{
			stmt = conn.createStatement();
			cmd = "create table tab1 (col smallint, col2 char(20));";
			rc = stmt.executeUpdate(cmd);
		}
		catch (SQLException e){
			System.out.println("FAILED: execution failed - statement: " + cmd);
			System.out.println("FAILED: " + e.getMessage());
		}
		
		try{
			cmd = "insert into tab1 values (1, 'abc');";
			stmt.addBatch(cmd);
			cmd = "insert into tab1 values (2, 'def');";
			stmt.addBatch(cmd);
			cmd = "insert into tab1 values (3, 'ghi');";
			stmt.addBatch(cmd);
			int[] updtcount = stmt.executeBatch();
			System.out.println("update count is " + updtcount[0]);
			stmt.close();
		}
		catch (SQLException e){
			System.out.println("FAILED: addBatch/executeBatch failed - statement: " + cmd);
			System.out.println("FAILED: " + e.getMessage());
		}
		
		examine_inserted_rows(conn);
		
		try{
			cmd = "insert into tab1 values (?, ?);" +"update tab1 set (col, col2) = (?, ?) where col = 1;" +"update tab1 set (col, col2) = (?, ?) where col = 2";
			pstmt = conn.prepareStatement(cmd);
			pstmt.setInt(1, 4);
			pstmt.setString(2, "jkl");
			pstmt.setInt(3, 5);
			pstmt.setString(4, "mno");
			pstmt.setInt(5, 6);
			pstmt.setString(6, "pqr");
			pstmt.addBatch();
			int[] updateCount = pstmt.executeBatch();
			pstmt.clearBatch();
			pstmt.close();
		}
		catch (SQLException e){
			System.out.println("FAILED: addBatch/executeBatch failed - preparestatement: " + cmd);
			System.out.println("FAILED: " + e.getMessage());
		}
		
		examine_updated_rows(conn);
		
		try{
			Statement stmt2 = conn.createStatement();
			cmd = "drop table tab1";
			stmt2.close();
		}
		catch (SQLException e){
			System.out.println("FAILED: execution failed - statement: " + cmd);
			System.out.println("FAILED: " + e.getMessage());
		}
		
		try{
			conn.close();
		}
		catch (SQLException e){
			System.out.println("FAILED: failed to close the connection!");
		}
		
		System.out.println(">>>End of " + testName + " test.");
	}
}