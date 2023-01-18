//40
public class func{
	public void init(){
        properties.load(BarChartSample.class.getResourceAsStream("/config.properties"));
        Class.forName(properties.getProperty("db.driver"));
        connection = DriverManager.getConnection(
            properties.getProperty("db.url"),
            properties.getProperty("db.username"),
            properties.getProperty("db.password")
        );
}
}
