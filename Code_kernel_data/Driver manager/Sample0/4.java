//3
public class func{
	public void getConnection(){
    Class.forName(job.get(DBConfiguration.DRIVER_CLASS_PROPERTY));
    if(job.get(DBConfiguration.USERNAME_PROPERTY) == null) {
      return DriverManager.getConnection(job.get(DBConfiguration.URL_PROPERTY));
    } else {
      return DriverManager.getConnection(
          job.get(DBConfiguration.URL_PROPERTY), 
          job.get(DBConfiguration.USERNAME_PROPERTY), 
          job.get(DBConfiguration.PASSWORD_PROPERTY));
    }
}
}
