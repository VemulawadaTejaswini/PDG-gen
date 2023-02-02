//169
public class func{
public void testSignedNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
        for (double d : new double[] { 0.0, 1.0, 123.1234}) {
            testSignedNumberSpec(conn, d);
        }
}
}
