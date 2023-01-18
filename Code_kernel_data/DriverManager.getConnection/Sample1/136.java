//135
public class func{
	public void main(String args[]){
            Connection conn = DriverManager.getConnection("jdbc:derby:hibernateDB;create=true", new Properties());
            Statement st = conn.createStatement();
            st.executeUpdate("create table EMPLOYEE( id         INT         PRIMARY KEY NOT NULL, " +
                                                    "first_name VARCHAR(20) default NULL," +
                                                    "last_name  VARCHAR(20) default NULL," +
                                                    "salary     INT         default NULL)");
}
}
