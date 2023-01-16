//27
public class func{
	public void shutdown(final boolean active){
            final Statement statement = getConnection().createStatement();
            statement.execute("SHUTDOWN");
            statement.close();
}
}
