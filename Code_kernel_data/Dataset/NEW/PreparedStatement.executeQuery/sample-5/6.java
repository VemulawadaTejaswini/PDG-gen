//6
public class func{
public void foo(Connection connection){
    ps.setString(getIntValue(), ""); // Compliant - first argument can not be evaluated
    ps.setInt(1, 0); // Compliant
    ResultSet rs = ps.executeQuery();
    rs.getString(0); // Noncompliant - First column index is 1
}
}
