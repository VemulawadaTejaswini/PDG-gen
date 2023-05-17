public class func{
public void selectFootSoldiers(){
        c = DriverManager.getConnection("jdbc:default:connection");
        Statement cStmt = c.createStatement();
        ResultSet rs = cStmt.executeQuery(
            "select * from s1.wages where category = " +
            FOOTSOLDIER);
}
}
