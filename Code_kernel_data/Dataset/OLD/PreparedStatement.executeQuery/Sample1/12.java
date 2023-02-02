//11
public class func{
	public void enumTransformation(){
        final PreparedStatement stmt = connection.prepareStatement(String.format("SELECT '%s' AS male_female;",
                    dbCode));
        final ResultSet result = stmt.executeQuery();
}
}
