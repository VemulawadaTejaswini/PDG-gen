//4
public class func{
public void testCS4595B_UniqueIndex(){
        Statement st = createStatement();
        st.executeUpdate("set ISOLATION to RR");
        st.execute("call SYSCS_UTIL.SYSCS_SET_RUNTIMESTATISTICS(1)");
        st.executeUpdate("create unique index foox on foo (a)");
        doTestCaseCS4595B(st, "Index");
}
}
