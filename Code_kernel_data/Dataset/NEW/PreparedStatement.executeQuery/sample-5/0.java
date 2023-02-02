//0
public class func{
public void getOrdersByProcess(Integer processId){
        stmt.setInt(1, processId.intValue());
        ResultSet res = stmt.executeQuery();
}
}
