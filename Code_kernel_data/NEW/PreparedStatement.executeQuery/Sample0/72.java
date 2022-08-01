//71
public class func{
	public void getTextID(String text){
        PreparedStatement prep = connection.prepareStatement(sql);
        prep.setString(1, text);
        ResultSet resultSet = prep.executeQuery();
        if (resultSet.next()) {
            id = resultSet.getInt("id");
        }
}
}
