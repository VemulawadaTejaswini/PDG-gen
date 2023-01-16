//63
public class func{
	public void execute(PushbackReader reader){
        while ((sql = readNextStatement(reader)) != null) {
            try {
                logger.fine("Executing SQL: " + sql);
                statement.execute(sql);
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
}
}
