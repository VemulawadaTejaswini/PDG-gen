public class func{
public void testFunctionTable(){
                TestFunctions.class.getName() + ".simpleFunctionTable\"");
        stat.execute("select * from simple_function_table() " +
                "where a>0 and b in ('x', 'y')");
}
}
