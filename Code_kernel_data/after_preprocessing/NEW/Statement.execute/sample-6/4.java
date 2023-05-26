//4
public class func{
public void enableXplainStyle(Statement s){
        for (int i = 0; i < tableNames.length; i++)
            if (hasTable(s, "XPLTEST", tableNames[i]))
                s.execute("delete from XPLTEST." + tableNames[i]);
        s.execute("call syscs_util.syscs_set_xplain_mode(0)");
}
}
