public class func{
public void executeQuery(DataSource dataSource,String... queries){
        for (String query : queries) {
            stmt.execute(query);
        }
}
}
