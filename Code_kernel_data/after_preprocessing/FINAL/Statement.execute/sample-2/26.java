public class func{
public void migrate(Connection connection){
            statement = connection.createStatement();
            statement.execute("CREATE TRIGGER clinics_history_trigger AFTER INSERT ON clinics FOR EACH ROW CALL\n" +
                    "\"org.flywaydb.core.internal.dbsupport.h2.TestTrigger\";");
            JdbcUtils.closeStatement(statement);
}
}
