//495
public class func{
	public void getDatabaseConnection(){
      return DriverManager.getConnection(JdbcStudentService.URL, 
                        JdbcStudentService.USERNAME, 
                        JdbcStudentService.PASSWORD);
}
}
