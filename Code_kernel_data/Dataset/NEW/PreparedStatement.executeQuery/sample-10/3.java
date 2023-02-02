//3
public class func{
public void countConglomerates(String tableName,PreparedStatement countCongloms,int expected){
        JDBC.assertSingleValueResultSet(
            countCongloms.executeQuery(), String.valueOf(expected));
}
}
