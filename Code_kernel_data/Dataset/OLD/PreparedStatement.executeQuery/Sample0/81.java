//80
public class func{
	public void print(){
            PreparedStatement statement = persistenceManager.getConnection().prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                logger.log(result.getInt("players") + "\t" + result.getString("number1")
                        + "\t" + result.getString("number2") + "\t" + result.getString("type") + "\t"
                        + result.getDouble("wins"));
            }
}
}
