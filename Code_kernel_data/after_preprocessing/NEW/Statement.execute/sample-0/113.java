//113
public class func{
public void createProcedureFindOneUser(Statement statement){
    statement.execute(
        "CREATE PROCEDURE findOneUser() " +
            "language java " +
            "dynamic result sets 1 " +
            "external name 'org.hibernate.jpa.test.procedure.JpaTckUsageTest.findOneUser' " +
            "parameter style java"
    );
}
}
