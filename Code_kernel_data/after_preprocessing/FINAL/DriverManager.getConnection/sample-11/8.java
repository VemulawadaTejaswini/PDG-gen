public class func{
public void openConnection(){
            Properties connectionProps = new Properties();
            connectionProps.put("password", "benjiql");
            return DriverManager.getConnection("jdbc:postgresql:benjiql", connectionProps);
}
}
