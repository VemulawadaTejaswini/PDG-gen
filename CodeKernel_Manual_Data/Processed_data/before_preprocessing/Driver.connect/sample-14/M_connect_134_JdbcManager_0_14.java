public class A{
	public static Connection connect(String url, String user, String password)throws SQLException{

		for(int i=0; i<vDrivers.size(); i++){
			JdbcDriver jdbcDrv = (JdbcDriver) vDrivers.elementAt(i);
			
			if (jdbcDrv.isLoaded()){
				Driver drv = jdbcDrv.getDriver();
				
				Properties p = new Properties();
				
				p.setProperty("user",     user);
				p.setProperty("password", password);
				
				
				if(drv.getClass().getName().indexOf("oracle.")>-1)p.setProperty("remarksReporting","true");

				Connection sqlConn = drv.connect(url, p);
				
				if (sqlConn != null)return sqlConn;
			}
		}
		
		
		return null;
	}
}