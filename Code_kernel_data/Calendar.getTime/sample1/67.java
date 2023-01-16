//66
public class func{
	public void setCalendar(PreparedStatement stmnt,int idx,Calendar val,Column col){
        setDate(stmnt, idx, val.getTime(), col);
}
}
