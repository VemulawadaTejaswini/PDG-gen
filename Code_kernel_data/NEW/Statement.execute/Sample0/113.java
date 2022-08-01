//112
public class func{
	public void createProcedureDeleteAllUsers(Statement statement){
    statement.execute(
        "CREATE PROCEDURE deleteAllUsers() " +
            "language java " +
            "external name 'org.hibernate.jpa.test.procedure.JpaTckUsageTest.deleteAllUsers' " +
            "parameter style java"
    );
}
}
