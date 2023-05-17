//37
public class func{
public void tearDown(){
        Statement st = createStatement();
        st.execute("drop table lobTable100M");
        st.close();
}
}
