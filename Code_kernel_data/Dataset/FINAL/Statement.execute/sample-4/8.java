public class func{
public void LineStringInPoint(){
        Statement st = connection.createStatement();
        st.execute("insert into test values (ST_LineFromText('LINESTRING( 0 18, 10 21, 16 23, 28 26, 44 31 )' ,101))");
}
}
