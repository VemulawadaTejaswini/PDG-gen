//232
public class func{
	public void getNextLobId(){
        reuse(sql, prep);
        prep = prepare(sql);
        rs = prep.executeQuery();
        rs.next();
        x = Math.max(x, rs.getLong(1) + 1);
        reuse(sql, prep);
}
}
