//694
public class func{
public void getConnection(){
            DriverShim.loadAndRegister(getDriver(), _opts
                    .getValue(InstallOptions.DATABASE_DRIVERCLASS));
                    DriverManager.getConnection(_opts
                            .getValue(InstallOptions.DATABASE_JDBCURL), _opts
                            .getValue(InstallOptions.DATABASE_USERNAME), _opts
                            .getValue(InstallOptions.DATABASE_PASSWORD));
}
}
