//37
public class func{
public void onDeleteCascadeWithLogQueryPlan(){
        setAutoCommit(false);
        Statement s = createStatement();
        s.execute("delete from a");
}
}
