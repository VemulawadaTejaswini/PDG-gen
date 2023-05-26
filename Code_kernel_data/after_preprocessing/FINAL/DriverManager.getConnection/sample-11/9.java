public class func{
public void setUp(){
      Properties properties = new Properties( );
      properties.put( "autocommit" , "true" );
      con = DriverManager.getConnection( dbURL , properties );
      con.createStatement( ).execute( "create table TEST1 (TIMED BIGINT  , FIELD1 VARCHAR(20), FIELD2 INT, PK BIGINT NOT NULL IDENTITY   )" );
      con.createStatement( ).execute( "create table TEST2 (FIELD1 CHAR(20), TIMED BIGINT , FIELD2 INT,PK BIGINT NOT NULL IDENTITY  )" );
      con.createStatement( ).execute( "create table TEST3 (FIELD1 BINARY, FIELD2 INT,TIMED BIGINT ,PK BIGINT NOT NULL IDENTITY )" );
      con.createStatement( ).execute( "create table TEST4 (FIELD1 CHAR(20), FIELD2 INT,TIME2D BIGINT, PK BIGINT NOT NULL IDENTITY)" );
}
}
