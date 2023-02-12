public class func{
public void establishConnection(){
            connection = DriverManager.getConnection("jdbc:sqlite:db/" + HibernateUtil.getActiveDatabase() + ".cre");
}
}
