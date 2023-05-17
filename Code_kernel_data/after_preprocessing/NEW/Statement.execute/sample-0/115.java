//115
public class func{
public void createXATransactionView(Statement s){
        s.execute(
                "create view XATESTUTIL.global_xactTable as " +
                "select  cast(global_xid as char(2)) as gxid," +
                " status, " +
                " CAST (case when first_instant is NULL then 'NULL' else 'false' end AS VARCHAR(8)) as readOnly, " +
                " cast (username as char(10)) as username, type " +
                " from syscs_diag.transaction_table");
}
}
