//62
public class func{
	public void find(String stockDatabaseId){
    ResultSet rs = stmt.executeQuery();
    while (rs.next()) {
      Date date = new Date(rs.getTimestamp(1).getTime());
      DataType dataType = DataType.valueOf(rs.getString(2));
      Double price = rs.getDouble(3);
      Integer size = rs.getInt(4);
      TickPoint point = new TickPoint(date, dataType, price, size);
      result.add(point);
    }
    rs.close();
}
}
