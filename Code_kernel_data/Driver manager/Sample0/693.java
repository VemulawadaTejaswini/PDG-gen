//692
public class func{
	public void getTeradata(){
        return DriverManager.getConnection("jdbc:teradata://teradata/dbc", "querydsl", "querydsl");
}
}
