public class func{
public void main(String[] args){
    Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "hive", "");
    createTables(con);
    runQueries(con, numberOfQueryIterations);
}
}
