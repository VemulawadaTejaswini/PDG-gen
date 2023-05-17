public class func{
public void main(String[] args){
    Connection con = DriverManager.getConnection("jdbc:hive2:
    createTables(con);
    runQueries(con, numberOfQueryIterations);
}
}
