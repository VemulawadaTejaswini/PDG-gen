//207
public class func{
	public void bindExecute(HrPreparedStatement state){
      st.setInt(1, state.id);
      rs = st.executeQuery();
      rs.next();
      ename = rs.getString(1);
      close(rs, null); // Statement is not closed
}
}
