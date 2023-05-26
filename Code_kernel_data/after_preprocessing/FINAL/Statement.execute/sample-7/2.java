public class func{
public void testCS4595A_PrimaryKey(){
        Statement st = createStatement();
        st.executeUpdate("set ISOLATION to RR");
        st.execute("call SYSCS_UTIL.SYSCS_SET_RUNTIMESTATISTICS(1)");
        st.executeUpdate(
            "create table foo (a int not null primary key, b int)");
        doTestCaseCS4595A(st, "Constraint");
}
}
