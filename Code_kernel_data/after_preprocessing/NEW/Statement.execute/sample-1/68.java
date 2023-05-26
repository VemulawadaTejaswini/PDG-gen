//68
public class func{
public void clear(){
    Statement st = TestUtils.getConnection().createStatement();
    st.execute("SPARQL CLEAR GRAPH <" + TEST_GRAPH_NAME + ">");
    st.close();
}
}
