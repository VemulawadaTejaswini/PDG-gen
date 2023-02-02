//14
public class func{
public void onBorrow(JDBCDataStore store,Connection cx){
                st = cx.createStatement();
                st.execute(command);
                store.closeSafe(st);
}
}
