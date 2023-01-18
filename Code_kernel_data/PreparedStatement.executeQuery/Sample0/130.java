//129
public class func{
	public void getOfferingCount(){
          statement = conn.prepareStatement ( "SELECT count(*) FROM offering_bundle" );
            ResultSet rs = statement.executeQuery();
          if (rs.next()) result = rs.getInt(1);
            statement.close();  
}
}
