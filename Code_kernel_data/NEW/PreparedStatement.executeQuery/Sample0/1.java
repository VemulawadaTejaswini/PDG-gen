//0
public class func{
	public void execute(Connection connection){
                    while (testGroups.next()) {
                        testIdsStatement.setString(1, testGroups.getString(1));
                        ResultSet testExecutions = testIdsStatement.executeQuery();
                        while (testExecutions.next()) {
                            testNames.add(testExecutions.getString(1));
                        }
                        testExecutions.close();
                    }
}
}
