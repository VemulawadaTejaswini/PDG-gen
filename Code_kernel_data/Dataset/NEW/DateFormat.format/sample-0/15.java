//15
public class func{
public void scanDateStringFormatterTest(){
    String expected = String.format("r f:q [] %s    v", dateFormat.format(new Date(0)));
    exec("deletetable t -f", true, "Table: [t] has been deleted");
}
}
