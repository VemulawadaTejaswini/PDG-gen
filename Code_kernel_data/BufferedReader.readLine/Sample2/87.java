//86
public class func{
	public void TestHeader(){
    BufferedReader reader = getResultReader();
    assertEquals(
        "GROUP,PACKAGE,CLASS,INSTRUCTION_MISSED,INSTRUCTION_COVERED,BRANCH_MISSED,BRANCH_COVERED,LINE_MISSED,LINE_COVERED,COMPLEXITY_MISSED,COMPLEXITY_COVERED,METHOD_MISSED,METHOD_COVERED",
        reader.readLine());
}
}
