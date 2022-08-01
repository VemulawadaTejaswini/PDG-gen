//56
public class func{
	public void testDecodeValues(boolean nullFixedWidth,boolean nullVariableWidth){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(
                "CREATE TABLE T(pk1 CHAR(15) not null, pk2 VARCHAR not null, CF1.v1 DATE, CF2.v2 VARCHAR, CF2.v1 VARCHAR " +
                "CONSTRAINT pk PRIMARY KEY (pk1, pk2)) ");
}
}
