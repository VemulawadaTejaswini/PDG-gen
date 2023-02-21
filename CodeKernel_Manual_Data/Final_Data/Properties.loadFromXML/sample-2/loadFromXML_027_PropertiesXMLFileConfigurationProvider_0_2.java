public class A{
	private void loadStream( final String streamName , final Properties props ) {
		try {
			log.config("streamName = " + streamName);
			InputStream is = getClass().getClassLoader().getResourceAsStream(streamName);
			if ( is != null ){
				props.loadFromXML(is);
			}else{
				log.warning( "Cannot find " + streamName + ".");
			}
		} catch (IOException e) {
			log.severe( "Cannot load " + streamName );
			log.severe( e.getMessage() );
		}
	}
}