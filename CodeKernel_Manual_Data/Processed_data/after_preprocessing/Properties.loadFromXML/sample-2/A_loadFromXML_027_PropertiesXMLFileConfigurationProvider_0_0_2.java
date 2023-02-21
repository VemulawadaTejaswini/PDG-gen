public class A{
	private void loadStream( final String streamName , final Properties props ) {
		InputStream is = getClass().getClassLoader().getResourceAsStream(streamName);
		props.loadFromXML(is);
	}
}